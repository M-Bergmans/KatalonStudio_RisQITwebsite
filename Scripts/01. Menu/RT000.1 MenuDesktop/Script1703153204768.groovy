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

WebUI.maximizeWindow()

String actual_url = WebUI.getUrl()

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_Diensten'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_Diensten_SoftwareTesting'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Software Testing')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_Diensten'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_Diensten_SHT'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Security En HackersTest (SHT)')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_Diensten'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_Diensten_UXLab'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'UX Lab')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Menu Objects/btn_Menu_OverOns'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Over Ons')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_OverOns'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_OverOns_MissieVisie'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Missie & Visie')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_OverOns'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_OverOns_HetGilde'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Het Gilde')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('Menu Objects/btn_Menu_OverOns'))

WebUI.click(findTestObject('Menu Objects/btn_Menu_OverOns_SuperTester'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Whitepaper SuperTester')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Menu Objects/btn_Menu_Blog'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Blog')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Menu Objects/btn_Menu_Vacatures'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Vacatures')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Menu Objects/btn_Contact opnemen'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Contact')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Menu Objects/btn_Logo_goHome'))

WebUI.verifyElementText(findTestObject('Page_Home - RisQIT/txt_H1_Title'), 'Ga voor duurzaamheid en vertrouwen, samen met ons!')

