# VisaAccountUpdaterSubscriptionApiApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscribeUsingPOST**](VisaAccountUpdaterSubscriptionApiApi.md#subscribeUsingPOST) | **POST** /vau/subscription-api/v1/subscriptions | Subscription API |
| [**subscriptionInquiryUsingPOST**](VisaAccountUpdaterSubscriptionApiApi.md#subscriptionInquiryUsingPOST) | **POST** /vau/subscription-api/v1/subscriptions/inquiry | Inquiry API |



## subscribeUsingPOST

> SubscriptionResponse subscribeUsingPOST(subscriptionRequest, accept)

Subscription API

Subscribes the PANs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisaAccountUpdaterSubscriptionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        VisaAccountUpdaterSubscriptionApiApi apiInstance = new VisaAccountUpdaterSubscriptionApiApi(defaultClient);
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
        String accept = "application/json"; // String | 
        try {
            SubscriptionResponse result = apiInstance.subscribeUsingPOST(subscriptionRequest, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisaAccountUpdaterSubscriptionApiApi#subscribeUsingPOST");
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
| **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  | |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the subscription is Success or AlreadySubscribed or Reject, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the subscription request is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the subscription could not be sucessfully processed. |  -  |


## subscriptionInquiryUsingPOST

> SubscriptionInquiryResponse subscriptionInquiryUsingPOST(subscriptionInquiryRequest, accept)

Inquiry API

Retrieve the Accounts subscription information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisaAccountUpdaterSubscriptionApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        VisaAccountUpdaterSubscriptionApiApi apiInstance = new VisaAccountUpdaterSubscriptionApiApi(defaultClient);
        SubscriptionInquiryRequest subscriptionInquiryRequest = new SubscriptionInquiryRequest(); // SubscriptionInquiryRequest | 
        String accept = "application/json"; // String | 
        try {
            SubscriptionInquiryResponse result = apiInstance.subscriptionInquiryUsingPOST(subscriptionInquiryRequest, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisaAccountUpdaterSubscriptionApiApi#subscriptionInquiryUsingPOST");
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
| **subscriptionInquiryRequest** | [**SubscriptionInquiryRequest**](SubscriptionInquiryRequest.md)|  | |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**SubscriptionInquiryResponse**](SubscriptionInquiryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the subscription inquiry is Success or Reject, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the subscription inquiry request is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the subscription inquiry could not be sucessfully processed. |  -  |

