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


class Index {

	@Given("User navigates to Demoblaze webpage")
	def navigateLoginPage() {
		try {
			WebUI.openBrowser('')
			WebUI.maximizeWindow()
			WebUI.deleteAllCookies()
			WebUI.navigateToUrl(GlobalVariable.loginPage)
			KeywordUtil.markPassed("Browser launched successfully")
			WebUI.takeScreenshot('C:\\Users\\Michael\\Documents\\Katalon Screenshots\\screenshot.png')
		}
		catch(WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop("Browser failed to launch")
			WebUI.closeBrowser()
		}
	}

	@When("User login using valid credentials")
	def enterValidCredentials() {
		WebUI.click(findTestObject('Login/lnkLogin'))
		WebUI.setText(findTestObject('Login/txtUsername'),GlobalVariable.username)
		WebUI.setEncryptedText(findTestObject('Login/txtPassword'), GlobalVariable.password)
		WebUI.click(findTestObject('Login/btnLogin'))
	}

	@When("User creates account")
	def createAccount() {
		WebUI.click(findTestObject('CreateAccount/lnkSignUp'))
		WebUI.setText(findTestObject('CreateAccount/txtUsername'),GlobalVariable.username)
		WebUI.setEncryptedText(findTestObject('CreateAccount/txtPassword'), GlobalVariable.password)
		WebUI.click(findTestObject('CreateAccount/btnSignUp'))
	}

	@Then("Close Browser")
	def closeBrowser() {
		Thread.sleep(5000)
		WebUI.closeBrowser()
	}
}