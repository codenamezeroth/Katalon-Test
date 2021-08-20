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

WebUI.navigateToUrl('http://139.59.120.232/')

WebUI.setText(findTestObject('Page_HR Payroll/input_username'), '00001')

WebUI.setEncryptedText(findTestObject('Page_HR Payroll/input_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Page_HR Payroll/Login_Botton'))

WebUI.click(findTestObject('Page_HR Payroll/emp_profile_buttion'))

WebUI.click(findTestObject('Page_HR Payroll/emp_member'))

WebUI.click(findTestObject('Page_HR Payroll/emp_manage'))

WebUI.click(findTestObject('Page_HR Payroll/emp_info'))

WebUI.click(findTestObject('Page_HR Payroll/emp_sale_1'))

WebUI.click(findTestObject('Page_HR Payroll/emp_sale_Profile'))

WebUI.click(findTestObject('Page_HR Payroll/Option_male'))

WebUI.click(findTestObject('Page_HR Payroll/input__birthDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_HR Payroll/button_year'))

WebUI.click(findTestObject('Page_HR Payroll/button_SelectM'))

WebUI.click(findTestObject('Page_HR Payroll/button_SelectM'))

WebUI.click(findTestObject('Page_HR Payroll/button_SelectM'))

WebUI.click(findTestObject('Page_HR Payroll/Select_BD_Year'))

WebUI.click(findTestObject('Page_HR Payroll/Select_BD_M'))

WebUI.click(findTestObject('Page_HR Payroll/Select_BD_D'))

WebUI.setText(findTestObject('Page_HR Payroll/Ages'), '25')

WebUI.setText(findTestObject('Page_HR Payroll/National'), 'ไทย')

WebUI.setText(findTestObject('Page_HR Payroll/Height'), '180')

WebUI.setText(findTestObject('Page_HR Payroll/Weight'), '75')

WebUI.setText(findTestObject('Page_HR Payroll/National_id'), '1234567890123')

WebUI.click(findTestObject('Page_HR Payroll/Select_s'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_HR Payroll/select_c_lc'))

WebUI.click(findTestObject('Page_HR Payroll/Select_m_lc'))

WebUI.setText(findTestObject('Page_HR Payroll/Set_tel'), '0854687997')

WebUI.setText(findTestObject('Page_HR Payroll/set_phone'), '053521074')

WebUI.setText(findTestObject('Page_HR Payroll/Set_line'), 'nicecompany')

WebUI.setText(findTestObject('Page_HR Payroll/set_email'), 'nicecompany@gamil.com')

WebUI.setText(findTestObject('Page_HR Payroll/set_add'), '178/526 ม 1 ต.สุเทพ อ.เมือง')

WebUI.setText(findTestObject('Page_HR Payroll/set_prov'), 'เชียงใหม่')

WebUI.setText(findTestObject('Page_HR Payroll/set_post'), '50000')

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/input__ant-radio-input'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/svg_1'))

WebUI.setText(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageWorkHistory_companyName'), 'nice')

WebUI.setText(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageWorkHistory_position'), 'nice')

WebUI.setText(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageWorkHistory_jobDescription'), 'nice')

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageWorkHistory_startDate'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/div_18'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/div__ant-picker w-full ant-picker-focused'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/div_20'))

WebUI.setText(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageWorkHistory_reasonLeaveWork'), 'no')

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/button__1'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/input__ant-radio-input'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/button__ant-btn ant-btn-icon-only'))

WebUI.setText(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageTrainingHistory_courseName'), 'css')

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/input__manageTrainingHistory_courseDate'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/td_3'))

WebUI.click(findTestObject('Object Repository/gg/Page_HR Payroll/button__1_2'))

WebUI.click(findTestObject('Page_HR Payroll/Select_inter_exp'))

WebUI.click(findTestObject('Page_HR Payroll/Select_workshop'))

WebUI.click(findTestObject('Page_HR Payroll/Save_button'))

