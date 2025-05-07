# DefaultApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionDeleteUsingPOST**](DefaultApi.md#subscriptionDeleteUsingPOST) | **POST** /vau/subscription-api/v1/subscriptions/delete | Delete PAN subscriptions |



## subscriptionDeleteUsingPOST

> SubscriptionDeleteResponse subscriptionDeleteUsingPOST(subscriptionDeleteRequest)

Delete PAN subscriptions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SubscriptionDeleteRequest subscriptionDeleteRequest = new SubscriptionDeleteRequest(); // SubscriptionDeleteRequest | 
        try {
            SubscriptionDeleteResponse result = apiInstance.subscriptionDeleteUsingPOST(subscriptionDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#subscriptionDeleteUsingPOST");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionDeleteRequest** | [**SubscriptionDeleteRequest**](SubscriptionDeleteRequest.md)|  | |

### Return type

[**SubscriptionDeleteResponse**](SubscriptionDeleteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

