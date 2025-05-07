package org.openapitools.client;

import org.openapitools.client.api.*;
import org.openapitools.client.model.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ApiClient client = new ApiClient();

    public static void main(String[] args) {
        client.setBasePath("http://localhost:8080");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Merchant Search");
            System.out.println("2. Subscription Create");
            System.out.println("3. Subscription Inquiry");
            System.out.println("4. Subscription Delete");
            System.out.println("5. StopAdvices");
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
