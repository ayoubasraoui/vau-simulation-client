

# RejectedMerchantEnrollmentResponse

[Reject Request]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rejectReason** | **String** | [This field contains the description of the reject code: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.]  |  |
|**rejectReasonCode** | **String** | [This field contains one of the following codes: * A—Acquirer segment is not enrolled * V—No data found in merchant field * X-Acquirer status is in test mode, please contact client services representative * T—Max merchants threshold passed for single request, current threshold is:100.]  |  |
|**acquirerSegmentId** | **Integer** | [This field  must contain a valid VAU Acquirer Segment ID.] |  |



