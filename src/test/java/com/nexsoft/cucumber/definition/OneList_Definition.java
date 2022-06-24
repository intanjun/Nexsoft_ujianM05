package com.nexsoft.cucumber.definition;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

import com.nexsoft.cucumber.pom.OneList;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OneList_Definition {

	protected AndroidDriver driver;
	protected OneList olist;
	
	public String screenshot() {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String waktu = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String namaFile = "C:\\nexsoft\\Cucumber_Ujian05_OneList\\src\\test\\resources\\ScreenShoot\\" + waktu + ".png";
		File screenshot = new File(namaFile);
		try {
			FileUtils.copyFile(srcFile, screenshot);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return namaFile;
	}

	@Before
	public void init() throws MalformedURLException {

		/*
			{
			  "platformName": "Android",
			  "appium:appPackage": "com.lolo.io.onelist",
			  "appium:appActivity": "com.lolo.io.onelist.MainActivity",
			  "appium:deviceName": "emulator-5554"
			}
		*/
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("deviceName", "emulator-5554");
//		capabilities.setCapability("platformVersion", "11.0");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		olist = new OneList(driver);
	}

	@Given("User berada di halaman MainActivity")
	public void gotoMainActivity() throws Throwable {
		System.out.println("User masuk ke Homepage");
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
	}

	@When("User menekan tombol add")
	public void addNewList() {
		olist.addList();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("User telah menekan tombol add");
	}
	
	@And("User memasukkan nama kegiatan {string}")
	public void inputNameList(String list_name) {
		olist.txtNameList.sendKeys(list_name);
		olist.save();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +list_name);
	}
	
	@And("User memasukkan nama item1 {string}")
	public void inputItemList1(String item_List1) {
		olist.txtItemList.sendKeys(item_List1);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List1);
	}
	
	@And("User memasukkan nama item2 {string}")
	public void inputItemList2(String item_List2) {
		olist.txtItemList.sendKeys(item_List2);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List2);
	}
	
	@And("User memasukkan nama item3 {string}")
	public void inputItemList3(String item_List3) {
		olist.txtItemList.sendKeys(item_List3);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List3);
	}
	
	@And("User memasukkan nama item4 {string}")
	public void inputItemList4(String item_List4) {
		olist.txtItemList.sendKeys(item_List4);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List4);
	}
//	Data Null
//	And User memasukkan nama item5 ""
//	@And("User memasukkan nama item5 {string}")
//	public void inputItemList5(String item_List5) {
//		olist.txtItemList.sendKeys(item_List5);
//		olist.save2();
//		System.out.println("List name diterima");
//	}
	
	@When("User menekan tombol add2")
	public void addNewList2() {
		olist.addList();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("User telah menekan tombol add");
	}
	
	@And("User memasukkan nama kegiatan2 {string}")
	public void inputNameList2(String list_name2) {
		olist.txtNameList.sendKeys(list_name2);
		olist.save();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +list_name2);
	}
	
	@And("User memasukkan nama item11 {string}")
	public void inputItemList11(String item_List11) {
		olist.txtItemList.sendKeys(item_List11);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List11);
	}
	
	@And("User memasukkan nama item21 {string}")
	public void inputItemList21(String item_List21) {
		olist.txtItemList.sendKeys(item_List21);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List21);
	}
	
	@And("User memasukkan nama item31 {string}")
	public void inputItemList31(String item_List31) {
		olist.txtItemList.sendKeys(item_List31);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List31);
	}
	
	@And("User memasukkan nama item41 {string}")
	public void inputItemList41(String item_List41) {
		olist.txtItemList.sendKeys(item_List41);
		olist.save2();
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
		System.out.println("List name diterima " +item_List41);
	}
	
	@And("User hapus data baris pertama")
	public void hapusItemList() {
		TouchAction touchNewEvent = new TouchAction(driver);
		touchNewEvent.tap(PointOption.point(544, 544)).perform();
		System.out.println("Item List terhapus");
	}

	@Then("User dapat melihat new button list yang baru dibuat")
	public void seeBtnList(String phone) throws Throwable {
		System.out.println("User melihat button list baru");
//		List untuk mengecek data
		List<WebElement> lstElement =driver.findElements(By.xpath("//android.widget.TextView[@resource-id='com.apozas.contactdiary:id/list_item']"));
//		Take ScreenShot
		String file = "<img src='file://" + screenshot() + "'height=\"450\" width=\"1017\"/>";
	}
}