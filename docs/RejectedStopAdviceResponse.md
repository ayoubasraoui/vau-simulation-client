

# RejectedStopAdviceResponse

[RejectedStopAdviceResponse]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **LocalDate** | [This field contains the start date, which shouldn&#39;t be less than the current date, and its format is yyyy-mm-dd, the default value is the current date.] |  [optional] |
|**rejectCode** | **String** | [This field contains one of the following reject codes: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant]  |  [optional] |
|**merchantName** | **String** | [This field must contain merchant name.] |  |
|**rejectMessage** | **String** | [This field contains the description of reject message: * H—Account number does not start with 2, 3, 4, 5 or 6 * G—Account number contains non-numeric characters or is blank * L—Account number is not of proper length (must be 13, 15, 16 or 19) * M—Account number is not mod 10 compliant * N—No stop advice applied, unable to find merchant information for the requested card acceptor id * R—Account number is not associated with requested segment id * S—Start date must not be less than the current date * D—Duplicate stop advice in the request * I—Mandatory field cardholderAccountNumber is missing or blank in the request * J—Mandatory field cardAcceptorId is missing or blank in the request * K—Mandatory field merchantName is missing or blank in the request * F—Stop advice is already placed for requested account number and merchant]  |  [optional] |
|**cardAcceptorId** | **String** | [This field must contain card acceptor id.] |  |
|**cardholderAccountNumber** | **String** | [This field must contain the account number (Visa, Mastercard, American Express, or Discover).] |  |



