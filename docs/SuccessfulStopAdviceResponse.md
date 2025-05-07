

# SuccessfulStopAdviceResponse

[SuccessfulStopAdviceResponse body]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startDate** | **LocalDate** | [This field contains the start date, which shouldn&#39;t be less than the current date, and its format is yyyy-mm-dd, the default value is the current date.] |  [optional] |
|**merchantName** | **String** | [This field must contain merchant name.] |  |
|**responseCode** | **String** | [This field contains one of the following response codes: * 1—Stop advice applied in both RTVAU and VAU * 2—Stop advice applied in VAU * 3—Stop advice applied in RTVAU  |  [optional] |
|**cardAcceptorId** | **String** | [This field must contain card acceptor id.] |  |
|**responseMessage** | **String** | [This field contains the description of the response message: * 1—Stop advice applied in both RTVAU and VAU * 2—Stop advice applied in VAU * 3—Stop advice applied in RTVAU  |  [optional] |
|**cardholderAccountNumber** | **String** | [This field must contain the account number (Visa, Mastercard, American Express, or Discover).] |  |



