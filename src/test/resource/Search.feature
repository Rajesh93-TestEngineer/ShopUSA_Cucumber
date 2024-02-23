Feature: Verifying the ShopUsA 

Scenario Outline: Verify product names
Given Launch Browser on holistar
When Search on products<names>

Examples:
|names|
|Mens Jeans|
|Sweaters|
|Jackets and coats|

