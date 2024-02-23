@All
Feature:Verify ShopUSA mens wear project

#Background:
#Given open browser on ShopUSA
@Addcart
Scenario:Verify product pass on the juckets Addcart Funcationality
When click on Mens wear
When click on Juckets and coats
When select on product 
Then click on size
Then click on AddBag

@smoke @regresion
Scenario: Verify product pass on the jeans Addcart Funcationality
When click on jeans then on click on joggers
When select on image
Then click on image size
Then clicks on AddBag
@Webtable
Scenario: Verify activeWear funcationality
When perform active wear 
Then click on image
Then click on sizeguide
And printing webTable of sizeguide
@QuickView
Scenario: Verify mens in polos functionality
When To perform mens
Then click on Polos
Then click on Quick view
Then click on Quick view closed
