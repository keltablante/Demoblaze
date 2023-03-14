package demoblaze
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And

class Dashboard{

	String name="Alpedro Ramoso", country="Philippines", city="Manila", card="1234 5678 1234 5678", month="MAR", year="2026"

	@And("User adds to cart")
	def addToCart(){
		WebUI.click(findTestObject('Dashboard/itemIndex0'))
		WebUI.click(findTestObject('itemDetail/btnAddToCart'))
	}

	@And("User checks out")
	def checkOut(){
		WebUI.click(findTestObject('Dashboard/lnkCart'))
		WebUI.click(findTestObject('Cart/btnPlaceOrder'))
		WebUI.setText(findTestObject('Place Order/txtName'),name)
		WebUI.setText(findTestObject('Place Order/txtCountry'),country)
		WebUI.setText(findTestObject('Place Order/txtCity'),city)
		WebUI.setText(findTestObject('Place Order/txtCard'),card)
		WebUI.setText(findTestObject('Place Order/txtMonth'),month)
		WebUI.setText(findTestObject('Place Order/txtYear'),year)
		WebUI.click(findTestObject('Place Order/btnPurchase'))
		WebUI.click(findTestObject('Place Order/btnOK'))
	}
	@And("User logs out")
	def logout() {
		WebUI.click(findTestObject('Dashboard/lnkLogout'))
	}
}