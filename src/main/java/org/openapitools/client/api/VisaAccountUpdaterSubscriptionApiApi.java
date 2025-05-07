package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.BaseApi;

import org.openapitools.client.model.BadFormattedErrorMessage;
import org.openapitools.client.model.GenericErrorMessage;
import org.openapitools.client.model.RejectedRequestResponse;
import org.openapitools.client.model.SubscriptionInquiryRequest;
import org.openapitools.client.model.SubscriptionInquiryResponse;
import org.openapitools.client.model.SubscriptionRequest;
import org.openapitools.client.model.SubscriptionResponse;

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
public class VisaAccountUpdaterSubscriptionApiApi extends BaseApi {

    public VisaAccountUpdaterSubscriptionApiApi() {
        super(new ApiClient());
    }

    public VisaAccountUpdaterSubscriptionApiApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Subscription API
     * Subscribes the PANs.
     * <p><b>200</b> - This response code will be returned in scenarios where the subscription is Success or AlreadySubscribed or Reject, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the subscription request is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the subscription could not be sucessfully processed.
     * @param subscriptionRequest  (required)
     * @param accept  (optional)
     * @return SubscriptionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionResponse subscribeUsingPOST(SubscriptionRequest subscriptionRequest, String accept) throws RestClientException {
        return subscribeUsingPOSTWithHttpInfo(subscriptionRequest, accept).getBody();
    }

    /**
     * Subscription API
     * Subscribes the PANs.
     * <p><b>200</b> - This response code will be returned in scenarios where the subscription is Success or AlreadySubscribed or Reject, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the subscription request is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the subscription could not be sucessfully processed.
     * @param subscriptionRequest  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;SubscriptionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionResponse> subscribeUsingPOSTWithHttpInfo(SubscriptionRequest subscriptionRequest, String accept) throws RestClientException {
        Object localVarPostBody = subscriptionRequest;
        
        // verify the required parameter 'subscriptionRequest' is set
        if (subscriptionRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionRequest' when calling subscribeUsingPOST");
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

        ParameterizedTypeReference<SubscriptionResponse> localReturnType = new ParameterizedTypeReference<SubscriptionResponse>() {};
        return apiClient.invokeAPI("/vau/subscription-api/v1/subscriptions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Inquiry API
     * Retrieve the Accounts subscription information
     * <p><b>200</b> - This response code will be returned in scenarios where the subscription inquiry is Success or Reject, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the subscription inquiry request is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the subscription inquiry could not be sucessfully processed.
     * @param subscriptionInquiryRequest  (required)
     * @param accept  (optional)
     * @return SubscriptionInquiryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionInquiryResponse subscriptionInquiryUsingPOST(SubscriptionInquiryRequest subscriptionInquiryRequest, String accept) throws RestClientException {
        return subscriptionInquiryUsingPOSTWithHttpInfo(subscriptionInquiryRequest, accept).getBody();
    }

    /**
     * Inquiry API
     * Retrieve the Accounts subscription information
     * <p><b>200</b> - This response code will be returned in scenarios where the subscription inquiry is Success or Reject, all possible response codes are explained below in the model.
     * <p><b>400</b> - This response code will be returned in scenarios where the subscription inquiry request is badly formatted.
     * <p><b>409</b> - This response code will be returned in scenarios where the subscription is rejected, all possible reasons for request rejection are explained below in the model.
     * <p><b>500</b> - This response code will be returned in scenarios where the subscription inquiry could not be sucessfully processed.
     * @param subscriptionInquiryRequest  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;SubscriptionInquiryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionInquiryResponse> subscriptionInquiryUsingPOSTWithHttpInfo(SubscriptionInquiryRequest subscriptionInquiryRequest, String accept) throws RestClientException {
        Object localVarPostBody = subscriptionInquiryRequest;
        
        // verify the required parameter 'subscriptionInquiryRequest' is set
        if (subscriptionInquiryRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionInquiryRequest' when calling subscriptionInquiryUsingPOST");
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

        ParameterizedTypeReference<SubscriptionInquiryResponse> localReturnType = new ParameterizedTypeReference<SubscriptionInquiryResponse>() {};
        return apiClient.invokeAPI("/vau/subscription-api/v1/subscriptions/inquiry", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
