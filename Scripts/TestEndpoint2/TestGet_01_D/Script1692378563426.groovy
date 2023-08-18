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

Get_01_D = WS.sendRequestAndVerify(findTestObject('Endpoint2-todos/GET-01'))

WS.verifyResponseStatusCode(Get_01_D, 200)

WS.verifyElementsCount(Get_01_D, 'userId', 200)

WS.verifyElementsCount(Get_01_D, 'id', 200)

WS.verifyElementsCount(Get_01_D, 'title', 200)

WS.verifyElementsCount(Get_01_D, 'completed', 200)

WS.verifyElementPropertyValue(Get_01_D, '[4].userId', '1')

WS.verifyElementPropertyValue(Get_01_D, '[4].id', '5')

WS.verifyElementPropertyValue(Get_01_D, '[4].title', 'laboriosam mollitia et enim quasi adipisci quia provident illum')

WS.verifyElementPropertyValue(Get_01_D, '[4].completed', 'false')

