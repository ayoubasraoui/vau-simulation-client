

# RejectedInquiryResponse

[Rejected Inquiry Response body]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rejectReason** | **String** | [This field contains the description of the reject code: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)]  |  [optional] |
|**expirationDate** | **String** | [This field contains the old expiration date in YYMM format, where YY &#x3D; 00-99 and MM &#x3D; 01–12] |  [optional] |
|**rejectReasonCode** | **String** | [This field contains one of the following codes: * 1—Account Number does not start with 2, 3, 4, 5 or 6 * 3—Account Number contains non-numeric characters or is blank * 4—Account Number is not of proper length (must be 13, 15, 16 or 19) * 5—Expiration Date is invalid (must be YYMM)]  |  [optional] |
|**cardholderAccountNumber** | **String** | [This field contains the account number that was submitted in the associated Acquirer Inquiry Request.] |  |



