

# RejectedRequestResponse1

[Reject Request]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.] |  |
|**rejectReason** | **String** | [This field contains the description of the reject code: * A—Acquirer segment is not enrolled * M—Merchant is not enrolled * V—No data found in inquiry field * 9—Max PANs threshold passed for single request. Max PANs allowed are bound to change, at present this limit is set to 100.]  |  [optional] |
|**subMerchantName** | **String** | [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub- merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.] |  [optional] |
|**rejectReasonCode** | **String** | [This field contains one of the following codes: * A—Acquirer segment is not enrolled * M—Merchant is not enrolled * V—No data found in inquiry field * 9—Max PANs threshold passed for single request. Max PANs allowed are bound to change, at present this limit is set to 100.]  |  [optional] |
|**acquirerSegmentId** | **Integer** | [This field  must contain a valid VAU Acquirer Segment ID.] |  |
|**acquirerInformation** | **String** | [If provided, it contains acquirer or merchant proprietary information such as a customer ID that is carried in the merchant’s back-end system.] |  [optional] |



