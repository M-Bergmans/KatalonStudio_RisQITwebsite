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

WebUI.navigateToUrl(GlobalVariable.URL + GlobalVariable.CONTACT)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/div_Contact opnemen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/h1_Contact'), 'Contact')

WebUI.click(findTestObject('Object Repository/Page_Contact - RisQIT/input_naam'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_naam'), Naam)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_adres'), Adres)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_woonplaats'), Woonplaats)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_e-mail'), Email)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_Telefoon'), Telefoon)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_opmerking'), Opmerking)

WebUI.click(findTestObject('Page_Contact - RisQIT/chkbx_PrivacybeleidAkkoord'))

WebUI.click(findTestObject('Object Repository/Page_Contact - RisQIT/btn_submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Contact - RisQIT/div_Er is een fout opgetreden bij het verst_b79445'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_opmerking'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/warning_Het veld is verplicht'), 'Het veld is verplicht.')

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_e-mail'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/warning_Het veld is verplicht'), 'Het veld is verplicht.')

WebUI.setText(findTestObject('Object Repository/Page_Contact - RisQIT/input_naam'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/warning_Het veld is verplicht'), 'Het veld is verplicht.')

WebUI.closeBrowser()

