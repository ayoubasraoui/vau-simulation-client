

# SuccessfulInquiryResponse

[Successful Inquiry Response body]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**newExpirationDate** | **String** | [This field contains one of the following: * The expiration date when new information is available, in YYMM format, where: YY &#x3D; 00–99 MM &#x3D; 01–12 Spaces for messages that indicate one of the following conditions:     * Closed Account {C}      * Contact Cardholder {Q}      * Participating BIN, No Match {P}      * Non-participating BIN, No Match {N} ] |  [optional] |
|**oldExpirationDate** | **String** | [This field contains the old expiration date in YYMM format, where YY &#x3D; 00-99 and MM &#x3D; 01–12] |  [optional] |
|**serviceIdentifier** | **String** | [This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * O—Cardholder Opt-Out     Note:        – When a &#39;Stop Advice&#39; is placed on a card and the acquirer/merchant is ready to accept          the code, they would receive the &#39;O&#39;.        – If the acquirer is not ready to accept &#39;O&#39;, then, VAU responds with &#39;P&#39;.        – To confirm the ability to receive &#39;O&#39;, please send email to VAU Client Support Team at          updater@visa.com (for North America customers), or customersupport@visa.com (for          Europe customers). * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.] |  [optional] |
|**previouslySentFlag** | **String** | [This field contains one of the following:  Y—Yes or N—No Note: A Y value indicates that exactly the same account information was requested by the acquirer and sent by VAU during the previous 40 days (the retention period), excluding the current day.] |  [optional] |
|**newCardholderAccountNumber** | **String** | [This field contains one of the following: * The account number when new information is available. * The account number if a validation response is provided. Spaces for records with the following service identifiers:     * Closed Account {C}     * Contact Cardholder {Q}     * Participating BIN, No Match {P}               Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS.     * Non-participating BIN, No Match {N} ] |  |
|**oldCardholderAccountNumber** | **String** | [This field contains the account number that was submitted in the associated Acquirer Inquiry Request.] |  |



