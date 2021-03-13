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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('www.gmail.com')

WebUI.click(findTestObject('xPage_Gmail/span_Create account'))

WebUI.click(findTestObject('xPage_Gmail/div_For myself'))

WebUI.delay(3)

WebUI.verifyTextPresent('Create your Google Account', false)

WebUI.setText(findTestObject('xPage_Create your Google Account/input_Continue to Gmail_firstName'), 'Ali')

WebUI.setText(findTestObject('xPage_Create your Google Account/input_Continue to Gmail_lastName'), 'Hassan')

WebUI.setText(findTestObject('xPage_Create your Google Account/input_Continue to Gmail_Username'), 'ah123212344')

WebUI.setEncryptedText(findTestObject('xPage_Create your Google Account/input_Passwd'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.setEncryptedText(findTestObject('xPage_Create your Google Account/input_ConfirmPasswd'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('xPage_Create your Google Account/div_Create_Account_Next'))

WebUI.delay(2)

WebUI.verifyTextPresent('Please choose a stronger password. Try a mix of letters, numbers and symbols.', false)

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('test/GmailCreateAccountwithuseofVariable'), [('FirstName') : 'Ali', ('LastName') : 'Hassan', ('UserName') : 'ah123212344'
        , ('ConfirmPassword') : 'o+tS4OuGt32s9ezZj287yw==', ('Password') : 'o+tS4OuGt32s9ezZj287yw=='], FailureHandling.STOP_ON_FAILURE)
