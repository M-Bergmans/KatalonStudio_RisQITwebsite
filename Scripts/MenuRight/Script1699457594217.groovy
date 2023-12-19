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

WebUI.setViewPortSize(900, 1000)

WebUI.navigateToUrl('https://nlrisqitww-chaca.savviihq.com/')

WebUI.click(findTestObject('MenuRightbar/path'))

WebUI.verifyElementText(findTestObject('MenuRightbar/a_Diensten'), 'Diensten')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Over ons'), 'Over ons')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Blog'), 'Blog')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Vacatures'), 'Vacatures')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/div_Contact opnemen'), 'Contact opnemen')

WebUI.click(findTestObject('Object Repository/MenuRightbar/button_Menu schakelen'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Software Testing'), 'Software Testing')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Security en HackersTest (SHT)'), 'Security en HackersTest (SHT)')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_UX Lab'), 'UX Lab')

WebUI.click(findTestObject('Object Repository/MenuRightbar/button_Menu schakelen'))

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Missie  Visie'), 'Missie & Visie')

WebUI.verifyElementText(findTestObject('Object Repository/MenuRightbar/a_Kwaliteit'), 'Kwaliteit')

WebUI.verifyElementVisible(findTestObject('Object Repository/MenuRightbar/svg_ast-mobile-svg ast-close-svg'))

WebUI.click(findTestObject('Object Repository/MenuRightbar/svg_ast-mobile-svg ast-close-svg'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/MenuRightbar/p_We are testers'))

WebUI.closeBrowser()

