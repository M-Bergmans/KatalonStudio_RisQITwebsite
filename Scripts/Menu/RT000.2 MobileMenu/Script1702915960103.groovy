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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Diensten'), 'Diensten')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Over ons'), 'Over ons')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Blog'), 'Blog')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Vacatures'), 'Vacatures')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/div_Contact opnemen'), 'Contact opnemen')

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Menu schakelen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Software Testing'), 'Software Testing')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_Security en HackersTest (SHT)'), 'Security en HackersTest (SHT)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/a_UX Lab'), 'UX Lab')

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/a_Software Testing'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Software Testing - RisQIT/h1_Software Testing'), 'Software Testing')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Security en HackersTest (SHT)'))

WebUI.verifyElementText(findTestObject('Page_Security en HackersTest (SHT) - RisQIT/h1_Security en HackersTest (SHT)'), 
    'Security En HackersTest (SHT)')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Security en HackersTest (SHT) - RisQIT/a_UX Lab'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_UX Lab - RisQIT/h1_UX Lab'), 'UX Lab')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_UX Lab - RisQIT/a_Missie  Visie'), 'Missie & Visie')

WebUI.verifyElementText(findTestObject('Object Repository/Page_UX Lab - RisQIT/a_Het Gilde'), 'Het Gilde')

WebUI.verifyElementText(findTestObject('Object Repository/Page_UX Lab - RisQIT/a_SuperTester'), 'SuperTester')

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/a_Missie  Visie'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Missie  Visie - RisQIT/h1_Missie  Visie'), 'Missie & Visie')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Missie  Visie - RisQIT/a_Het Gilde'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Het Gilde - RisQIT/h1_Het Gilde'), 'Het Gilde')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Het Gilde - RisQIT/a_SuperTester'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SuperTester - RisQIT/h1_Whitepaper SuperTester'), 'Whitepaper SuperTester')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Het Gilde - RisQIT/a_Blog'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blog - RisQIT/h1_Blog'), 'Blog')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Blog - RisQIT/a_Vacatures'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Vacatures - RisQIT/h1_Vacatures'), 'Vacatures')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Home - RisQIT/button_Main Menu'))

WebUI.click(findTestObject('Object Repository/Page_Software Testing - RisQIT/a_Diensten'))

WebUI.click(findTestObject('Object Repository/Page_UX Lab - RisQIT/button_Menu schakelen'))

WebUI.click(findTestObject('Object Repository/Page_Vacatures - RisQIT/div_Contact opnemen'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Contact - RisQIT/h1_Contact'), 'Contact')

WebUI.navigateToUrl(actual_url)

WebUI.click(findTestObject('Object Repository/Page_Contact - RisQIT/img_custom-logo entered lazyloaded'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home - RisQIT/h1_Ga voor duurzaamheid en vertrouwen, same_4bc4a8'), 
    'Ga voor duurzaamheid en vertrouwen, samen met ons!')

