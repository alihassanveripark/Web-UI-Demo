import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.openBrowser('')
//WebUI.maximizeWindow()
//WebUI.navigateToUrl('https://vtonline04.crm4.dynamics.com/main.aspx?appid=3c8180b8-272d-4224-ae9b-0a05707bd8c8')
//WebUI.setText(findTestObject('xLogin_CRM/Txt_UserName'), 'demouser@vtonline04.onmicrosoft.com')
//WebUI.click(findTestObject('xLogin_CRM/Btn_Next'))
//WebUI.setEncryptedText(findTestObject('xLogin_CRM/Txt_Password'), 'qnfvi7m85xwnV/zpHQoAzw==')
//WebUI.click(findTestObject('Veritouch_Complaints_Top up Complaints/Btn_SignIn'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('xLogin_CRM/Btn_PopUpYes'))
WebUI.verifyElementVisible(findTestObject('Veritouch_Complaints_Top up Complaints/Span_CustomerSearch'))

if (true) {
    WebUI.click(findTestObject('Veritouch_Complaints_Top up Complaints/Span_CustomerSearch'))
} else {
    WebUI.setAlertText('Customer Search not visible')
}

WebUI.waitForElementVisible(findTestObject('Veritouch_Complaints_Top up Complaints/Txt_CustomerNameSearch'), 0)

