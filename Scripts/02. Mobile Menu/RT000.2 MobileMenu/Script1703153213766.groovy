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

WebUI.setViewPortSize(912, 1000)

String actual_url = WebUI.getUrl()

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_Diensten'), 'Diensten')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_PullDown_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_SoftwareTesting'), 'Software Testing')

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_SoftwareTesting'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Software Testing')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_PullDown_1'))

WebUI.verifyElementText(findTestObject('Mobile Menu Objects/btn_MobileMenu_SHT'), 'Security en HackersTest (SHT)')

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_SHT'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Security En HackersTest (SHT)')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_PullDown_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu__UXLab'), 'UX Lab')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu__UXLab'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'UX Lab')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_OverOns'), 'Over ons')

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_OverOns'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Over Ons')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_PullDown_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_MissieVisie'), 'Missie & Visie')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_MissieVisie'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Missie & Visie')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_PullDown_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_HetGilde'), 'Het Gilde')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_HetGilde'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Het Gilde')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenu_PullDown_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_SuperTester'), 'SuperTester')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_SuperTester'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Whitepaper SuperTester')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_Blog'), 'Blog')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_Blog'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Blog')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_Vacatures'), 'Vacatures')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_Vacatures'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Vacatures')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_MobileMenuMain'))

WebUI.verifyElementText(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_ContactOpnemen'), 'Contact opnemen')

WebUI.click(findTestObject('Object Repository/Mobile Menu Objects/btn_MobileMenu_ContactOpnemen'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Contact')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Mobile Menu Objects/btn_LogoMobile_goHome'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Ga voor duurzaamheid en vertrouwen, samen met ons!')

