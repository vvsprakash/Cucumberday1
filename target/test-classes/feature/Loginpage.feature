Feature: Verify Adactin details

Scenario Outline: Verify Adactin login with invalid Credentials

Given user is on adactin login page
When user should perform login "<username>" and "<password>"

And user should search hotels "<Location>","<Hotels >","<RoomType>", "<NumberofRooms>","<AdultsperRoom>","<ChildrenperRoom>",

And user should enter details  "<FirstName>","<LastName>","<BillingAddress>","<CardNo>","<CardType>","<CardEMonth>", "<CardEyear>","<CVV>"

Then user should verify success message 
 
 Examples:
 
 
|username|password|Location|Hotels|RoomType|NumberofRooms|AdultsperRoom|ChildrenperRoom|FirstName|LastName|BillingAddress|CardNo|CardType|CardEMonth|CardEyear|CVV|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234| 
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|         
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|
|VVSuryaPrakash|Surya4118$|Sydney|Hotel Creek|Standard|2 - Two|3 - Three|1 - One|VVS|Prakash|Visakhapatnam|7894561230123654|American Express|December|2022|234|

         