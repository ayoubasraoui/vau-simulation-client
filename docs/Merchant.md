

# Merchant

[Merchant Object]

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**city** | **String** | [Merchant city name] |  [optional] |
|**state** | **String** | [Merchant state name] |  [optional] |
|**reject** | [**RejectMerchantSearch**](RejectMerchantSearch.md) |  |  [optional] |
|**merchantId** | **String** | [Acquirer assigns the merchant ID. This field must contain a valid VAU Merchant ID.] |  |
|**postalCode** | **String** | [Merchant postal code] |  [optional] |
|**contactName** | **String** | [Merchant contact name] |  [optional] |
|**countryCode** | **String** | [Merchant country code] |  [optional] |
|**contactEmail** | **String** | [Merchant contact email] |  [optional] |
|**contactPhone** | **String** | [Contact phone number of the merchant] |  [optional] |
|**merchantName** | **String** | [Name of Merchant] |  [optional] |
|**parentCompany** | **String** | [Parent company name of  the merchants] |  [optional] |
|**cardAcceptorId** | **String** | [Merchant card acceptor id] |  [optional] |
|**merchantStatus** | **String** | [Merchant status, This field contains one of the following status: * Active — Merchant status is Active * InActive — Merchant status is In Active * In-Progress — Merchant enrollment is in progress * NotFound — Merchant not found in VAU * Declined — Merchant unable to pass screening * Reject — Merchant search is rejected, reject code and reject message will be returned]  |  |
|**streetAddress1** | **String** | [Address1 for the merchant] |  [optional] |
|**streetAddress2** | **String** | [Address2 for the merchant] |  [optional] |
|**internetAddress** | **String** | [Internet address for the merchant] |  [optional] |
|**merchantDescriptor** | **String** | [Merchant descriptor] |  [optional] |
|**merchantCategoryCode** | **String** | [A 4 digit code assigned by the merchant’s acquirer to identify the merchant’s type of business.] |  [optional] |
|**merchantLineBusiness** | **String** | [Merchant line business] |  [optional] |
|**merchantAcquiringIdentifiers** | **List&lt;String&gt;** | [Merchant acquiring identifier] |  [optional] |



