package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.BadFormattedErrorMessage2;
import org.openapitools.client.model.EncryptedPayload;
import org.openapitools.client.model.GenericErrorMessage;
import org.openapitools.client.model.OutboundResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-29T11:09:21.433785600+01:00[Africa/Casablanca]", comments = "Generator version: 7.12.0")
public class PushSubscribeCallbackApiApi extends BaseApi {

    public PushSubscribeCallbackApiApi() {
        super(new ApiClient());
    }

    public PushSubscribeCallbackApiApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Push Subscribe Callback API
     * Push Subscribe Callback API
     * <p><b>200</b> - This response code will be returned in scenarios where account update processing is successful. All possible response codes are explained in the model
     * <p><b>400</b> - This response code will be returned in scenarios where the request is badly formatted.
     * <p><b>500</b> - This response code will be returned in scenarios where the ping test request could not be sucessfully processed.
     * @param encryptedPayload  (required)
     * @param keyId VDP MLE keyId used for encryption and decryption (optional)
     * @param xCorrelationID Correlation ID for tracking requests (optional)
     * @param accept  (optional)
     * @return OutboundResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OutboundResponse mockAccountUpdateResponse(EncryptedPayload encryptedPayload, String keyId, String xCorrelationID, String accept) throws RestClientException {
        return mockAccountUpdateResponseWithHttpInfo(encryptedPayload, keyId, xCorrelationID, accept).getBody();
    }

    /**
     * Push Subscribe Callback API
     * Push Subscribe Callback API
     * <p><b>200</b> - This response code will be returned in scenarios where account update processing is successful. All possible response codes are explained in the model
     * <p><b>400</b> - This response code will be returned in scenarios where the request is badly formatted.
     * <p><b>500</b> - This response code will be returned in scenarios where the ping test request could not be sucessfully processed.
     * @param encryptedPayload  (required)
     * @param keyId VDP MLE keyId used for encryption and decryption (optional)
     * @param xCorrelationID Correlation ID for tracking requests (optional)
     * @param accept  (optional)
     * @return ResponseEntity&lt;OutboundResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OutboundResponse> mockAccountUpdateResponseWithHttpInfo(EncryptedPayload encryptedPayload, String keyId, String xCorrelationID, String accept) throws RestClientException {
        Object localVarPostBody = encryptedPayload;
        
        // verify the required parameter 'encryptedPayload' is set
        if (encryptedPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'encryptedPayload' when calling mockAccountUpdateResponse");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (keyId != null)
        localVarHeaderParams.add("keyId", apiClient.parameterToString(keyId));
        if (xCorrelationID != null)
        localVarHeaderParams.add("X-Correlation-ID", apiClient.parameterToString(xCorrelationID));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "aplications/json", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OutboundResponse> localReturnType = new ParameterizedTypeReference<OutboundResponse>() {};
        return apiClient.invokeAPI("/vau/registration-api/v1/callbackconfiguration", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "aplications/json", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
