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

WebUI.click(findTestObject('Veritouch_Complaints_Top up Complaints/Txt_CustomerNameSearch'))

WebUI.setText(findTestObject('Veritouch_Complaints_Top up Complaints/Txt_CustomerNameSearch'), 'Thomas Miller\n')

WebUI.waitForElementVisible(findTestObject('Veritouch_Complaints_Top up Complaints/btn_InGenius'), 0)

WebUI.click(findTestObject('Veritouch_Complaints_Top up Complaints/btn_InGenius'))

WebUI.click(findTestObject('Veritouch_Complaints_Top up Complaints/Page_Customer Search Information UI Customer Search - Dynamics 365/button_Search'))

WebUI.waitForElementVisible(findTestObject('xSearchCustomerScreen/a_Thomas Miller'), 5)

WebUI.verifyElementVisible(findTestObject('xSearchCustomerScreen/a_Thomas Miller'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('xSearchCustomerScreen/a_Thomas Miller'))

