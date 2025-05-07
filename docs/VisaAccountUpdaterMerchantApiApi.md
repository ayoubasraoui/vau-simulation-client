# VisaAccountUpdaterMerchantApiApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**merchantEnrolmentUsingPOST**](VisaAccountUpdaterMerchantApiApi.md#merchantEnrolmentUsingPOST) | **POST** /vau/onboard-api/acquirer/v1/merchants | Merchant Enrollment |
| [**merchantSearchUsingPOST**](VisaAccountUpdaterMerchantApiApi.md#merchantSearchUsingPOST) | **POST** /vau/onboard-api/acquirer/v1/merchants/search | Merchant Search |



## merchantEnrolmentUsingPOST

> MerchantEnrolmentResponse merchantEnrolmentUsingPOST(merchantEnrolmentRequest, accept)

Merchant Enrollment

Enroll new merchants by providing following requested information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisaAccountUpdaterMerchantApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        VisaAccountUpdaterMerchantApiApi apiInstance = new VisaAccountUpdaterMerchantApiApi(defaultClient);
        MerchantEnrolmentRequest merchantEnrolmentRequest = new MerchantEnrolmentRequest(); // MerchantEnrolmentRequest | 
        String accept = "application/json"; // String | 
        try {
            MerchantEnrolmentResponse result = apiInstance.merchantEnrolmentUsingPOST(merchantEnrolmentRequest, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisaAccountUpdaterMerchantApiApi#merchantEnrolmentUsingPOST");
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
| **merchantEnrolmentRequest** | [**MerchantEnrolmentRequest**](MerchantEnrolmentRequest.md)|  | |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**MerchantEnrolmentResponse**](MerchantEnrolmentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the merchant enrolment is successful, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the merchant enrolment is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the merchant enrolment is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the merchant enrolment could not be sucessfully processed. |  -  |


## merchantSearchUsingPOST

> MerchantSearchResponse merchantSearchUsingPOST(merchantSearchRequest, accept)

Merchant Search

Merchants can be searched by providing following requested information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisaAccountUpdaterMerchantApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        VisaAccountUpdaterMerchantApiApi apiInstance = new VisaAccountUpdaterMerchantApiApi(defaultClient);
        MerchantSearchRequest merchantSearchRequest = new MerchantSearchRequest(); // MerchantSearchRequest | 
        String accept = "application/json"; // String | 
        try {
            MerchantSearchResponse result = apiInstance.merchantSearchUsingPOST(merchantSearchRequest, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisaAccountUpdaterMerchantApiApi#merchantSearchUsingPOST");
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
| **merchantSearchRequest** | [**MerchantSearchRequest**](MerchantSearchRequest.md)|  | |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**MerchantSearchResponse**](MerchantSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the merchant search is successful, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the merchant search is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the merchant search is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the merchant search could not be sucessfully processed. |  -  |

