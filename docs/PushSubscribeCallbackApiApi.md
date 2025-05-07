# PushSubscribeCallbackApiApi

All URIs are relative to *https://sandbox.api.visa.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**mockAccountUpdateResponse**](PushSubscribeCallbackApiApi.md#mockAccountUpdateResponse) | **POST** /vau/registration-api/v1/callbackconfiguration | Push Subscribe Callback API |



## mockAccountUpdateResponse

> OutboundResponse mockAccountUpdateResponse(encryptedPayload, keyId, xCorrelationID, accept)

Push Subscribe Callback API

Push Subscribe Callback API

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PushSubscribeCallbackApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://sandbox.api.visa.com");

        PushSubscribeCallbackApiApi apiInstance = new PushSubscribeCallbackApiApi(defaultClient);
        EncryptedPayload encryptedPayload = new EncryptedPayload(); // EncryptedPayload | 
        String keyId = "keyId_example"; // String | VDP MLE keyId used for encryption and decryption
        String xCorrelationID = "xCorrelationID_example"; // String | Correlation ID for tracking requests
        String accept = "application/json"; // String | 
        try {
            OutboundResponse result = apiInstance.mockAccountUpdateResponse(encryptedPayload, keyId, xCorrelationID, accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PushSubscribeCallbackApiApi#mockAccountUpdateResponse");
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
| **encryptedPayload** | [**EncryptedPayload**](EncryptedPayload.md)|  | |
| **keyId** | **String**| VDP MLE keyId used for encryption and decryption | [optional] |
| **xCorrelationID** | **String**| Correlation ID for tracking requests | [optional] |
| **accept** | **String**|  | [optional] [enum: application/json] |

### Return type

[**OutboundResponse**](OutboundResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: aplications/json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This response code will be returned in scenarios where account update processing is successful. All possible response codes are explained in the model |  -  |
| **400** | This response code will be returned in scenarios where the request is badly formatted. |  -  |
| **500** | This response code will be returned in scenarios where the ping test request could not be sucessfully processed. |  -  |

