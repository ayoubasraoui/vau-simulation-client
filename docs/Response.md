

# Response

[Acquirer-api response body]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rejects** | [**List&lt;RejectedInquiryResponse&gt;**](RejectedInquiryResponse.md) | [List of Rejected Inquiry Response] |  |
|**responses** | [**List&lt;SuccessfulInquiryResponse&gt;**](SuccessfulInquiryResponse.md) | [List of Successful Inquiry Responses] |  |
|**merchantId** | **String** | [This field contains the VAU Merchant ID that was submitted in the associated Acquirer Inquiry Request.] |  |
|**subMerchantName** | **String** | [This field contains the sub merchant name that was submitted in the associated Acquirer Inquiry Request.] |  [optional] |
|**acquirerSegmentId** | **Integer** | [This field contains the VAU Acquirer Segment ID of the associated Acquirer Inquiry Request.] |  |
|**acquirerOrMerchantProprietaryInfo** | **String** | [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.] |  [optional] |



