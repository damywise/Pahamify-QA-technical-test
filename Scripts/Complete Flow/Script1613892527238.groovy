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

Mobile.startApplication('C:\\Users\\Asus\\git\\Pahamify-QA-technical-test\\QA_TEST.apk', true)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Selanjutnya'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Mulai'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Sudah punya akunLogin di sini'), 0)

Mobile.setText(findTestObject('Object Repository/Objek/android.widget.EditText - email'), 'qa_07@premium.com', 0)

Mobile.setText(findTestObject('Object Repository/Objek/android.widget.EditText - kata sandi'), 'YHXFCPCZ', 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Masuk'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Belajar'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.TextView - Fisika'), 0)

Mobile.tap(findTestObject('Object Repository/Objek/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Objek/android.widget.TextView - Dinamika Benda Tegar'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Objek/android.widget.Button - Putar'), 0)

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

