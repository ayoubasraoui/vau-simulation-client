

# RejectedRequestResponse

[Reject Request]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.] |  |
|**rejectReason** | **String** | [This field contains the description of the reject code: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100.]  |  |
|**subMerchantName** | **String** | [If inquiry is submitted by a merchant, then this field must be empty. If inquiry is submitted by a third-party aggregator on behalf of a merchant, then this field must be populated with the sub- merchant name. Acquirers and processors must pass the value to Visa. No special characters are allowed.] |  [optional] |
|**rejectReasonCode** | **String** | [This field contains one of the following codes: * A—Acquirer segment is not enrolled * X-Acquirer status is in test mode, please contact client services representative * M—Merchant is not enrolled or inactive * V—No data found in subscription field * 9—Max subscription threshold passed for single request, current threshold is:100\&quot;.]  |  |
|**acquirerSegmentId** | **Integer** | [This field  must contain a valid VAU Acquirer Segment ID.] |  |



