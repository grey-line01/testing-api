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

WS.sendRequest(findTestObject('Endpoint2-todos/GET-01'))

Get_01_F = WS.sendRequestAndVerify(findTestObject('Endpoint2-todos/GET-01'))

WS.verifyResponseStatusCode(Get_01_F, 200)

WS.verifyElementsCount(Get_01_F, 'userId', 200)

WS.verifyElementsCount(Get_01_F, 'id', 200)

WS.verifyElementsCount(Get_01_F, 'title', 200)

WS.verifyElementsCount(Get_01_F, 'completed', 200)

WS.verifyElementPropertyValue(Get_01_F, '[6].userId', '1')

WS.verifyElementPropertyValue(Get_01_F, '[6].id', '7')

WS.verifyElementPropertyValue(Get_01_F, '[6].title', 'illo expedita consequatur quia in')

WS.verifyElementPropertyValue(Get_01_F, '[6].completed', 'false')
