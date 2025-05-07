# VisaAccountUpdaterAcquirerApiApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inquiryUsingPOST**](VisaAccountUpdaterAcquirerApiApi.md#inquiryUsingPOST) | **POST** /vau/acquirer-api/v1/inquiry | Acquirer API for PANs Inquiry |



## inquiryUsingPOST

> Response inquiryUsingPOST(inquiryRequest)

Acquirer API for PANs Inquiry

Retrieve the new PANs information for requested old PANs.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisaAccountUpdaterAcquirerApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        VisaAccountUpdaterAcquirerApiApi apiInstance = new VisaAccountUpdaterAcquirerApiApi(defaultClient);
        Request inquiryRequest = new Request(); // Request | inquiryRequest
        try {
            Response result = apiInstance.inquiryUsingPOST(inquiryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisaAccountUpdaterAcquirerApiApi#inquiryUsingPOST");
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
| **inquiryRequest** | [**Request**](Request.md)| inquiryRequest | |

### Return type

[**Response**](Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the inquiry is successful, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the inquiry is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the inquiry is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the inquiry could not be sucessfully processed. |  -  |

