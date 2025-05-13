//package org.openapitools.client;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.openapitools.client.model.OutboundResponse;
//import org.openapitools.client.model.AccountUpdatesResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.*;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.*;
//
//@Component
//public class VisaUpdateScheduler {
//
//    private final RestTemplate restTemplate = new RestTemplate();
//    private final String issuerUrl = "http://localhost:8080/vau/issuer-api/v1/updates";
//
//
//    @Scheduled(initialDelay = 1000, fixedRate = 60000) // Run every 60 seconds
//    public void checkForUpdates() {
//        System.out.println("📤 [Visa] Sending scheduled update request to Issuer...");
//
//        try {
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            HttpEntity<Map<String, String>> request = new HttpEntity<>(new HashMap<>(), headers);
//
//            ResponseEntity<OutboundResponse> response = restTemplate.exchange(
//                    issuerUrl,
//                    HttpMethod.POST,
//                    request,
//                    OutboundResponse.class
//            );
//
//            OutboundResponse updates = response.getBody();
//            ObjectMapper mapper = new ObjectMapper();
//            System.out.println("📦 RAW JSON:\n" + mapper.writeValueAsString(updates));
//            if (updates != null && updates.getAccountUpdates() != null && !updates.getAccountUpdates().isEmpty()) {
//                System.out.println("✅ [Visa] Received the following updates:");
//                for (AccountUpdatesResponse update : updates.getAccountUpdates()) {
//                    System.out.printf("🔁 PAN: %s → %s | Exp: %s → %s%n",
//                            update.getOldCardholderAccountNumber(),
//                            update.getNewCardholderAccountNumber(),
//                            update.getOldExpirationDate(),
//                            update.getNewExpirationDate()
//                    );
//                }
//            } else {
//                System.out.println("ℹ️ [Visa] No updates at this moment.");
//            }
//        } catch (Exception e) {
//            System.out.println("❌ [Visa] Error during PAN update request.");
//            e.printStackTrace();
//        }
//    }
//}
