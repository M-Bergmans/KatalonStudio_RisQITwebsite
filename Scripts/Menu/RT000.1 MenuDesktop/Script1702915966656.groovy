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

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_Diensten'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_Diensten_SoftwareTesting'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Software Testing - RisQIT/h1_Software Testing'), 'Software Testing')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_Diensten'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_Diensten_SHT'))

WebUI.verifyElementText(findTestObject('Page_Security en HackersTest (SHT) - RisQIT/h1_Security en HackersTest (SHT)'), 
    'Security En HackersTest (SHT)')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_Diensten'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_Diensten_UXLab'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_UX Lab - RisQIT/h1_UX Lab'), 'UX Lab')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('MenuTopbar/btn_Menu_OverOns'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Over ons - RisQIT/h1_Over ons'), 'Over Ons')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_OverOns'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_OverOns_MissieVisie'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Missie  Visie - RisQIT/h1_Missie  Visie'), 'Missie & Visie')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_OverOns'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_OverOns_HetGilde'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Het Gilde - RisQIT/h1_Het Gilde'), 'Het Gilde')

WebUI.navigateToUrl(actual_url)

WebUI.mouseOver(findTestObject('MenuTopbar/btn_Menu_OverOns'))

WebUI.click(findTestObject('MenuTopbar/btn_Menu_OverOns_SuperTester'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SuperTester - RisQIT/h1_Whitepaper SuperTester'), 'Whitepaper SuperTester')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('MenuTopbar/btn_Menu_Blog'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blog - RisQIT/h1_Blog'), 'Blog')

WebUI.click(findTestObject('MenuTopbar/btn_Menu_Vacatures'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vacatures - RisQIT/h1_Vacatures'), 'Vacatures')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/MenuTopbar/Page_Vacatures - RisQIT/div_Contact opnemen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/h1_Contact'), 'Contact')

WebUI.click(findTestObject('MenuTopbar/img_Logo'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/h1_Ga voor duurzaamheid en vertrouwen, same_4bc4a8'), 
    'Ga voor duurzaamheid en vertrouwen, samen met ons!')

