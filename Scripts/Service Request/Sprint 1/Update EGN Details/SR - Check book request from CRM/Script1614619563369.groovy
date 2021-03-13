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

WebUI.callTestCase(findTestCase('Common Method/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Method/CustomerSearch'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Method/OpenCustomerDetails'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common Method/NewServiceRequestCreation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('xService Request/Subject_Selection_ServiceRequest/Subject'))

WebUI.click(findTestObject('xService Request/Subject_Selection_ServiceRequest/RetailServicerequest'))

WebUI.click(findTestObject('xService Request/Subject_Selection_ServiceRequest/RetailServiceRequests_Accounts'))

WebUI.click(findTestObject('xService Request/Subject_Selection_ServiceRequest/RetailServiceRequests_Accounts_ChequeBookRequest'))

WebUI.click(findTestObject('xService Request/SR_Information New SR/ChequeBookDelivery'))

WebUI.selectOptionByLabel(findTestObject('xService Request/SR_Information New SR/ChequeBookDelivery'), 'Branch', false)

WebUI.click(findTestObject('xService Request/SR_Information New SR/CheckBookLeaves'))

WebUI.selectOptionByIndex(findTestObject('xService Request/SR_Information New SR/CheckBookLeaves'), 2)

WebUI.click(findTestObject('xService Request/SR_Information New SR/span_Save'))

WebUI.waitForElementPresent(findTestObject('xService Request/Administration/li_AdministrationTab'), 5)

TrackingNumber = WebUI.getText(findTestObject('xService Request/SR_Information New SR/div_TrackingNumber'))

println(TrackingNumber)

WebUI.click(findTestObject('xService Request/Administration/li_AdministrationTab'))

WebUI.closeBrowser()

