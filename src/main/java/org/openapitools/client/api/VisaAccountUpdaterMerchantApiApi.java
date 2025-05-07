package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.BadFormattedErrorMessage;
import org.openapitools.client.model.GenericErrorMessage;
import org.openapitools.client.model.MerchantEnrolmentRequest;
import org.openapitools.client.model.MerchantEnrolmentResponse;
import org.openapitools.client.model.MerchantSearchRequest;
import org.openapitools.client.model.MerchantSearchResponse;
import org.openapitools.client.model.RejectedMerchantEnrollmentResponse;
import org.openapitools.client.model.RejectedMerchantSearchResponse;

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
public class VisaAccountUpdaterMerchantApiApi extends BaseApi {

    public VisaAccountUpdaterMerchantApiApi() {
        super(new ApiClient());
    }

    public VisaAccountUpdaterMerchantApiApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Merchant Enrollment
     * Enroll new merchants by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the merchant enrolment is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the merchant enrolment is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the merchant enrolment is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the merchant enrolment could not be sucessfully processed.
     * @param merchantEnrolmentRequest  (required)
     * @param accept  (optional)
     * @return MerchantEnrolmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MerchantEnrolmentResponse merchantEnrolmentUsingPOST(MerchantEnrolmentRequest merchantEnrolmentRequest, String accept) throws RestClientException {
        return merchantEnrolmentUsingPOSTWithHttpInfo(merchantEnrolmentRequest, accept).getBody();
    }

    /**
     * Merchant Enrollment
     * Enroll new merchants by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the merchant enrolment is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the merchant enrolment is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the merchant enrolment is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the merchant enrolment could not be sucessfully processed.
     * @param merchantEnrolmentRequest  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;MerchantEnrolmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MerchantEnrolmentResponse> merchantEnrolmentUsingPOSTWithHttpInfo(MerchantEnrolmentRequest merchantEnrolmentRequest, String accept) throws RestClientException {
        Object localVarPostBody = merchantEnrolmentRequest;
        
        // verify the required parameter 'merchantEnrolmentRequest' is set
        if (merchantEnrolmentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantEnrolmentRequest' when calling merchantEnrolmentUsingPOST");
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

        ParameterizedTypeReference<MerchantEnrolmentResponse> localReturnType = new ParameterizedTypeReference<MerchantEnrolmentResponse>() {};
        return apiClient.invokeAPI("/vau/onboard-api/acquirer/v1/merchants", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Merchant Search
     * Merchants can be searched by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the merchant search is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the merchant search is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the merchant search is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the merchant search could not be sucessfully processed.
     * @param merchantSearchRequest  (required)
     * @param accept  (optional)
     * @return MerchantSearchResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MerchantSearchResponse merchantSearchUsingPOST(MerchantSearchRequest merchantSearchRequest, String accept) throws RestClientException {
        return merchantSearchUsingPOSTWithHttpInfo(merchantSearchRequest, accept).getBody();
    }

    /**
     * Merchant Search
     * Merchants can be searched by providing following requested information
     * <p><b>200</b> - This response code will be returned in scenarios where the merchant search is successful, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the merchant search is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the merchant search is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the merchant search could not be sucessfully processed.
     * @param merchantSearchRequest  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;MerchantSearchResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MerchantSearchResponse> merchantSearchUsingPOSTWithHttpInfo(MerchantSearchRequest merchantSearchRequest, String accept) throws RestClientException {
        Object localVarPostBody = merchantSearchRequest;
        
        // verify the required parameter 'merchantSearchRequest' is set
        if (merchantSearchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'merchantSearchRequest' when calling merchantSearchUsingPOST");
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

        ParameterizedTypeReference<MerchantSearchResponse> localReturnType = new ParameterizedTypeReference<MerchantSearchResponse>() {};
        return apiClient.invokeAPI("/vau/onboard-api/acquirer/v1/merchants/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
