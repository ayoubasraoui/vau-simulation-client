

# Request

[Acquirer-api request body]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**inquiries** | [**List&lt;Inquiry&gt;**](Inquiry.md) | [List of Inquiries] |  |
|**merchantId** | **String** | [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.] |  |
|**subMerchantName** | **String** | [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub-merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.] |  [optional] |
|**acquirerSegmentId** | **Integer** | [This field must contain a valid VAU Acquirer Segment ID.] |  |
|**acquirerOrMerchantProprietaryInfo** | **String** | [If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.] |  [optional] |



