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

WebUI.verifyTextPresent('Bloemstraat 8b 6851 CS Huissen', false)

WebUI.verifyElementText(findTestObject('Footer Objects/lnk_Telnr'), '+31(0)6 46 40 70 26')

WebUI.verifyElementText(findTestObject('Footer Objects/lnk_infoATrisqit.nl'), 'info@risqit.nl')

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_FreeTest'), 'href', 'https://www.freetest.nu/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_FreeTest'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Home'), 'href', GlobalVariable.URL, 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_OverOns'), 'href', GlobalVariable.URL + GlobalVariable.OVER_ONS, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Cases'), 'href', GlobalVariable.URL + 'cases/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Blog'), 'href', GlobalVariable.URL + GlobalVariable.BLOG, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Vacatures'), 'href', GlobalVariable.URL + GlobalVariable.VACATURES, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Contact'), 'href', GlobalVariable.URL + GlobalVariable.CONTACT, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_SoftwareTesting'), 'href', GlobalVariable.URL + 
    GlobalVariable.SOFTWARETESTING, 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_SHT'), 'href', GlobalVariable.URL + GlobalVariable.SHT, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_UXLab'), 'href', GlobalVariable.URL + GlobalVariable.UXLAB, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_Facebook'), 'href', 'https://www.facebook.com/risqitbv/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_Facebook'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_X_TestersWe'), 'href', 'https://twitter.com/testerswe', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_X_TestersWe'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_X_qit_ris'), 'href', 'https://twitter.com/qit_ris', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_X_qit_ris'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_Insta'), 'href', 'https://www.instagram.com/risqitinsta/', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_Insta'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_LinkedIn'), 'href', 'https://linkedin.com/company/risqit-bv', 
    0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_socials_LinkedIn'), 'target', '_blank', 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Algemene voorwaarden'), 'href', GlobalVariable.URL + 
    GlobalVariable.ALGVOORW, 0)

WebUI.verifyElementAttributeValue(findTestObject('Footer Objects/lnk_Privacybeleid'), 'href', GlobalVariable.URL + GlobalVariable.PRIVACYBELEID, 
    0)

