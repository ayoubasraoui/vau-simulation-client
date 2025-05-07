package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.BadFormattedErrorMessage1;
import org.openapitools.client.model.GenericErrorMessage1;
import org.openapitools.client.model.RejectedRequestResponse1;
import org.openapitools.client.model.Request;
import org.openapitools.client.model.Response;

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
public class VisaAccountUpdaterAcquirerApiApi extends BaseApi {

    public VisaAccountUpdaterAcquirerApiApi() {
        super(new ApiClient());
    }

    public VisaAccountUpdaterAcquirerApiApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Acquirer API for PANs Inquiry
     * Retrieve the new PANs information for requested old PANs.
     * <p><b>200</b> - This response code will be returned in scenarios where the inquiry is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the inquiry is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the inquiry is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the inquiry could not be sucessfully processed.
     * @param inquiryRequest inquiryRequest (required)
     * @return Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Response inquiryUsingPOST(Request inquiryRequest) throws RestClientException {
        return inquiryUsingPOSTWithHttpInfo(inquiryRequest).getBody();
    }

    /**
     * Acquirer API for PANs Inquiry
     * Retrieve the new PANs information for requested old PANs.
     * <p><b>200</b> - This response code will be returned in scenarios where the inquiry is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the inquiry is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the inquiry is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the inquiry could not be sucessfully processed.
     * @param inquiryRequest inquiryRequest (required)
     * @return ResponseEntity&lt;Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Response> inquiryUsingPOSTWithHttpInfo(Request inquiryRequest) throws RestClientException {
        Object localVarPostBody = inquiryRequest;
        
        // verify the required parameter 'inquiryRequest' is set
        if (inquiryRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inquiryRequest' when calling inquiryUsingPOST");
        }
        

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

        ParameterizedTypeReference<Response> localReturnType = new ParameterizedTypeReference<Response>() {};
        return apiClient.invokeAPI("/vau/acquirer-api/v1/inquiry", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
