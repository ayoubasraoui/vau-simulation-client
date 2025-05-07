# IssuerStopAdviceApiApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**stopAdviceUsingPOST**](IssuerStopAdviceApiApi.md#stopAdviceUsingPOST) | **POST** /vau/issuer-api/v1/stopadvices | Issuer Stop Advice API |



## stopAdviceUsingPOST

> StopAdviceResponse stopAdviceUsingPOST(stopAdviceRequest, accept)

Issuer Stop Advice API

Issuer can place stop advice by providing following requested information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IssuerStopAdviceApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        IssuerStopAdviceApiApi apiInstance = new IssuerStopAdviceApiApi(defaultClient);
        StopAdviceRequest stopAdviceRequest = new StopAdviceRequest(); // StopAdviceRequest | 
        String accept = "application/json"; // String | 
        try {
            StopAdviceResponse result = apiInstance.stopAdviceUsingPOST(stopAdviceRequest, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IssuerStopAdviceApiApi#stopAdviceUsingPOST");
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
| **stopAdviceRequest** | [**StopAdviceRequest**](StopAdviceRequest.md)|  | |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**StopAdviceResponse**](StopAdviceResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where the stop advice is successful, all possible response codes are explained below in the model. |  -  |
| **400** | This response code will be returned in scenarios where the stop advice is badly formatted. |  -  |
| **409** | This response code will be returned in scenarios where the stop advice is rejected, all possible reasons for request rejection are explained below in the model. |  -  |
| **500** | This response code will be returned in scenarios where the stop advice could not be sucessfully processed. |  -  |

