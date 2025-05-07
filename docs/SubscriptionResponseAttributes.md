

# SubscriptionResponseAttributes

[Subscription response attributes]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reject** | [**RejectedSubscriptionResponse**](RejectedSubscriptionResponse.md) |  |  [optional] |
|**expirationDate** | **String** | [This field contains the expiration date in YYMM format, where YY &#x3D; 00-99 and MM &#x3D; 01–12] |  [optional] |
|**subscribedStatus** | **String** | Subscription Status: Success, AlreadySubscribed, Reject] |  |
|**newExpirationDate** | **String** | [If provided, it must contain the expiration date of the account on file at the merchant for billing purposes. The date must be in YYMM format] |  [optional] |
|**serviceIdentifier** | **String** | [This field contains one of the following: * A—Account number change message * C—Closed account advice * E—Expiration date change * N—Non-participating BIN * Q—Contact cardholder advice * P—Participating BIN, no match         Note: UK only—This might also mean that the account is currently being switched from one bank to a different bank as part of the UKCASS. * V—Match made, account number and expiration date unchanged.] |  [optional] |
|**cardholderAccountNumber** | **String** | [This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.] |  |
|**newCardholderAccountNumber** | **String** | [This field must contain the account number (Visa, Mastercard, American Express, or Discover) that is on file at the merchant for billing purposes.] |  [optional] |
|**acquirerOrMerchantProprietaryInfo** | **String** | [This field contains the Acquirer or merchant Proprietary information that was submitted in the associated Acquirer Inquiry Request.] |  [optional] |



