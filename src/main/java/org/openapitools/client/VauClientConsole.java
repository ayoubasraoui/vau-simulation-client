package org.openapitools.client;

import org.openapitools.client.api.*;
import org.openapitools.client.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import org.springframework.http.HttpHeaders;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.Flow;

@Component
public class VauClientConsole implements CommandLineRunner {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ApiClient client = new ApiClient();

    public void run(String[] args) {
        client.setBasePath("http://localhost:8080");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Merchant Search");
            System.out.println("2. Subscription Create");
            System.out.println("3. Subscription Inquiry");
            System.out.println("4. Subscription Delete");
            System.out.println("5. StopAdvices");
            System.out.println("6. Search Updates");
            System.out.println("0. Exit");
            System.out.print("> ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1" -> handleMerchantSearch();
                    case "2" -> handleSubscriptionCreate();
                    case "3" -> handleSubscriptionInquiry();
                    case "4" -> handleSubscriptionDelete();
                    case "5" -> handleStopAdvices();
                    case "6" -> handleSearchAndApplyUpdate();
                    case "0" -> System.exit(0);
                    default -> System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("❌ Error during operation: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static void handleMerchantSearch() {
        var api = new VisaAccountUpdaterMerchantApiApi(client);
        System.out.print("Enter Merchant ID to search: ");
        String merchantId = scanner.nextLine().trim();

        var request = new MerchantSearchRequest()
                .addMerchantsItem(new MerchantId().merchantId(merchantId))
                .acquirerSegmentId(2);

        try {
            var response = api.merchantSearchUsingPOST(request, "application/json");

            if (response.getMerchants() != null && !response.getMerchants().isEmpty()) {
                var merchant = response.getMerchants().get(0);

                if ("Reject".equalsIgnoreCase(merchant.getMerchantStatus())) {
                    System.out.println("❌ Rejected: " + merchant.getReject().getRejectMessage());
                } else {
                    System.out.println("\n✅ Merchant Details:");
                    System.out.println(merchant);
                }
            } else {
                System.out.println("⚠️ No merchant information returned.");
            }

        } catch (org.springframework.web.client.HttpClientErrorException.Conflict e) {
            System.out.println("❌ Duplicate Merchant ID found. Server responded with 409 Conflict.");
        } catch (Exception e) {
            System.out.println("❌ Error occurred during merchant search.");
            e.printStackTrace();
        }
    }


    private static void handleSubscriptionCreate() {
        var api = new VisaAccountUpdaterSubscriptionApiApi(client);

        System.out.print("Enter Merchant ID: ");
        String merchantId = scanner.nextLine().trim();
        if (merchantId.length() != 12) {
            System.out.println("❌ Merchant ID must be exactly 12 digits.");
            return;
        }

        System.out.print("Enter Sub-Merchant Name: ");
        String subMerchantName = scanner.nextLine().trim();

        System.out.print("Enter Cardholder Account Number (PAN): ");
        String pan = scanner.nextLine().trim();

        System.out.print("Enter Expiration Date (YYMM): ");
        String expiry = scanner.nextLine().trim();

        // Optional input or fixed for mock
        String proprietaryInfo = "180720216995565000113            XXXXAIBR";

        SubscriptionRequestAttributes attributes = new SubscriptionRequestAttributes()
                .cardholderAccountNumber(pan)
                .expirationDate(expiry)
                .acquirerOrMerchantProprietaryInfo(proprietaryInfo);

        SubscriptionRequest request = new SubscriptionRequest()
                .merchantId(merchantId)
                .subMerchantName(subMerchantName)
                .acquirerSegmentId(2)
                .subscriptions(Collections.singletonList(attributes));

        try {
            var response = api.subscribeUsingPOST(request, "application/json");
            System.out.println("\n✅ Subscription Response:");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("❌ Error during subscription create:");
            System.out.println(e.getMessage());
        }
    }


    private static void handleSubscriptionInquiry() {
        var api = new VisaAccountUpdaterSubscriptionApiApi(client);

        System.out.print("Enter Merchant ID: ");
        String merchantId = scanner.nextLine().trim();
        System.out.print("Enter Sub-Merchant Name: ");
        String subMerchantName = scanner.nextLine().trim();
        System.out.print("Enter Cardholder Account Number (PAN): ");
        String pan = scanner.nextLine().trim();

        InquirySubscriptionAttributes attr = new InquirySubscriptionAttributes()
                .cardholderAccountNumber(pan);

        SubscriptionInquiryRequest request = new SubscriptionInquiryRequest()
                .merchantId(merchantId)
                .subMerchantName(subMerchantName)
                .acquirerSegmentId(2)
                .subscriptions(Collections.singletonList(attr));

        try {
            var response = api.subscriptionInquiryUsingPOST(request, "application/json");
            System.out.println("✅ Inquiry Response:");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("❌ Error during subscription inquiry:");
            e.printStackTrace();
        }
    }

    private static void handleSearchAndApplyUpdate() {
        System.out.print("Enter PAN to search for updates: ");
        String pan = scanner.nextLine().trim();

        try {
            Map<String, Object> pathParams = new HashMap<>();
            MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
            queryParams.add("pan", pan);

            HttpHeaders headers = new HttpHeaders();
            MultiValueMap<String, String> cookies = new LinkedMultiValueMap<>();
            MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<>();

            List<MediaType> acceptList = List.of(MediaType.APPLICATION_JSON);
            MediaType contentType = MediaType.APPLICATION_JSON;

            ParameterizedTypeReference<Map<String, Object>> responseType =
                    new ParameterizedTypeReference<>() {};

            ResponseEntity<Map<String, Object>> responseEntity = client.invokeAPI(
                    "/vau/issuer-api/v1/search-update",     // 1
                    HttpMethod.GET,                         // 2
                    pathParams,                             // 3
                    queryParams,                            // 4
                    null,                                   // 5 body
                    headers,                                // 6 headers
                    cookies,                                // 7 cookies
                    formParams,                             // 8 form params
                    acceptList,                             // 9 Accept header
                    contentType,                            // 10 Content-Type
                    new String[] {},                        // 11 auth
                    responseType                            // 12 return type
            );

            Map<String, Object> data = responseEntity.getBody();
            if (data == null) {
                System.out.println("❌ No response body received.");
                return;
            }

            System.out.println("\n🔍 Search Result:");
            System.out.println("PAN: " + data.get("pan"));
            System.out.println("Old Expiry: " + data.get("oldExpiry"));

            if (Boolean.TRUE.equals(data.get("updated"))) {
                System.out.println("✅ Update Applied or Found:");
                System.out.println("→ New PAN: " + data.get("newPan"));
                System.out.println("→ New Expiry: " + data.get("newExpiry"));
            } else {
                System.out.println("ℹ️  No update applied: " + data.get("message"));
            }

        } catch (org.springframework.web.client.HttpClientErrorException.NotFound e) {
            System.out.println("❌ PAN not found.");
        } catch (Exception e) {
            System.out.println("❌ Unexpected error:");
            e.printStackTrace();
        }
    }








    private static void handleSubscriptionDelete() {
        var api = new DefaultApi(client);

        System.out.print("Enter Merchant ID: ");
        String merchantId = scanner.nextLine().trim();
        System.out.print("Enter Sub-Merchant Name: ");
        String subMerchantName = scanner.nextLine().trim();
        System.out.print("Enter Cardholder Account Number (PAN): ");
        String pan = scanner.nextLine().trim();

        DeleteSubscriptionAttributes attr = new DeleteSubscriptionAttributes()
                .cardholderAccountNumber(pan)
                .acquirerOrMerchantProprietaryInfo("180720216995565000113            XXXXAIBR");

        SubscriptionDeleteRequest request = new SubscriptionDeleteRequest()
                .merchantId(merchantId)
                .subMerchantName(subMerchantName)
                .acquirerSegmentId(2)
                .subscriptions(Collections.singletonList(attr));

        try {
            var response = api.subscriptionDeleteUsingPOST(request);
            System.out.println("✅ Delete Response:");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("❌ Error during subscription delete:");
            e.printStackTrace();
        }
    }
    private static void handleSearchUpdate() {
        var api = new VisaAccountUpdaterSubscriptionApiApi(client);

        System.out.print("Enter PAN to search for updates: ");
        String pan = scanner.nextLine().trim();

        try {
            var response = api.subscriptionInquiryUsingPOST(
                    new SubscriptionInquiryRequest()
                            .merchantId("000000705853") // default mock ID or prompt if needed
                            .subMerchantName("SUB-MERCHANT-NAME")
                            .acquirerSegmentId(2)
                            .subscriptions(Collections.singletonList(
                                    new InquirySubscriptionAttributes().cardholderAccountNumber(pan)
                            )),
                    "application/json"
            );

            var entry = response.getSubscriptions().get(0);
            System.out.println("\n🔍 Search Result:");
            System.out.println("PAN: " + entry.getCardholderAccountNumber());
            System.out.println("Status: " + entry.getSubscribedStatus());

            if ("Reject".equalsIgnoreCase(entry.getSubscribedStatus())) {
                System.out.println("❌ Reason: " + entry.getReject().getRejectReason());
            } else {
                Optional<Flow.Subscription> sub = // you would fetch it in the server, but not available here
                        Optional.empty(); // ← not feasible on client directly unless you expose a GET endpoint
                System.out.println("ℹ️  Updates applied will be shown in update response.");
            }
        } catch (Exception e) {
            System.out.println("❌ Error during update search:");
            e.printStackTrace();
        }
    }


    private static void handleStopAdvices() {
        var api = new IssuerStopAdviceApiApi(client);

        System.out.print("Enter Cardholder Account Number (PAN): ");
        String pan = scanner.nextLine().trim();
        System.out.print("Enter Merchant Name: ");
        String merchantName = scanner.nextLine().trim();
        System.out.print("Enter Card Acceptor ID: ");
        String cardAcceptorId = scanner.nextLine().trim();

        StopAdvice advice = new StopAdvice()
                .cardholderAccountNumber(pan)
                .merchantName(merchantName)
                .cardAcceptorId(cardAcceptorId)
                .startDate(LocalDate.now());

        StopAdviceRequest request = new StopAdviceRequest()
                .issuerSegmentId(2)
                .stopadvices(Collections.singletonList(advice));

        try {
            var response = api.stopAdviceUsingPOST(request, "application/json");
            System.out.println("✅ StopAdvice Response:");
            System.out.println(response);
        } catch (Exception e) {
            System.out.println("❌ Error during stop advice:");
            e.printStackTrace();
        }
    }
}
