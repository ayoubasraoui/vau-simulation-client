package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.BadFormattedErrorMessage;
import org.openapitools.client.model.GenericErrorMessage;
import org.openapitools.client.model.RejectedStopAdviceRequestResponse;
import org.openapitools.client.model.StopAdviceRequest;
import org.openapitools.client.model.StopAdviceResponse;

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
public class IssuerStopAdviceApiApi extends BaseApi {

    public IssuerStopAdviceApiApi() {
        super(new ApiClient());
    }

    public IssuerStopAdviceApiApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Issuer Stop Advice API
     * Issuer can place stop advice by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the stop advice is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the stop advice is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the stop advice is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the stop advice could not be sucessfully processed.
     * @param stopAdviceRequest  (required)
     * @param accept  (optional)
     * @return StopAdviceResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StopAdviceResponse stopAdviceUsingPOST(StopAdviceRequest stopAdviceRequest, String accept) throws RestClientException {
        return stopAdviceUsingPOSTWithHttpInfo(stopAdviceRequest, accept).getBody();
    }

    /**
     * Issuer Stop Advice API
     * Issuer can place stop advice by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the stop advice is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the stop advice is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the stop advice is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the stop advice could not be sucessfully processed.
     * @param stopAdviceRequest  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;StopAdviceResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StopAdviceResponse> stopAdviceUsingPOSTWithHttpInfo(StopAdviceRequest stopAdviceRequest, String accept) throws RestClientException {
        Object localVarPostBody = stopAdviceRequest;
        
        // verify the required parameter 'stopAdviceRequest' is set
        if (stopAdviceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stopAdviceRequest' when calling stopAdviceUsingPOST");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<StopAdviceResponse> localReturnType = new ParameterizedTypeReference<StopAdviceResponse>() {};
        return apiClient.invokeAPI("/vau/issuer-api/v1/stopadvices", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
            "application/json"
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
