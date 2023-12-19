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

WebUI.navigateToUrl('https://nlrisqitww-chaca.savviihq.com/')

WebUI.takeElementScreenshotAsCheckpoint('img_Logo', findTestObject('MenuTopbar/img_Logo'))

WebUI.verifyElementClickable(findTestObject('Object Repository/MenuTopbar/img_Logo'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten'), 'Diensten')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_SoftwareTesting'))

WebUI.mouseOver(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_SoftwareTesting'), 'Software Testing')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_SoftwareTesting'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_SHT'), 'Security en HackersTest (SHT)')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_SHT'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_UXLab'), 'UX Lab')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Diensten_UXLab'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns'), 'Over ons')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns_MissieVisie'))

WebUI.mouseOver(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns_MissieVisie'), 'Missie & Visie')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns_MissieVisie'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns_SuperTester'), 'Kwaliteit')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_OverOns_SuperTester'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Cases'), 'Cases')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Cases'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Blog'), 'Blog')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Blog'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Vacatures'), 'Vacatures')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Vacatures'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuTopbar/btn_Menu_Contact'), 'Contact opnemen')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuTopbar/btn_Menu_Contact'))

WebUI.closeBrowser()

