package com.nexsoft.cucumber.pom;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class OneList {

	private AndroidDriver driver;
//	Add New List
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnAdd;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement txtNameList;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	public WebElement txtItemList;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	public WebElement btnSaveItem;
	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsLayout")
	public WebElement optMore; // Bisa dibuat kaya mitigation -> contact diary
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnSave;

//	Header Activity
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listsRecyclerView")
	public WebElement listHeader;


	public OneList(AndroidDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void addList() {
		btnAdd.click();
	}
	
	public void setListHeader(List<String> choice) {
		listHeader.click();

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		for (String no : choice) {

			String xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
					+"android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"
					+"androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
					+"android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/"
					+"androidx.recyclerview.widget.RecyclerView/android.widget.TextView["+no+"]";

			driver.findElement(By.xpath(xpath)).click();
		}
//		driver.findElement(By.id("android:id/button1")).click();
	}

	public String getTxtName() {
		return txtNameList.getText();
	}

	public void save() {
		btnSave.click();
	}
	
	public void save2() {
		btnSaveItem.click();
	}
	
//	Assertion
	public boolean verifAdaTidak(String xpathIsi, String itemList) {
		List<WebElement> lstElement = driver.findElements(By.xpath(xpathIsi));
		
		boolean checkData = false;
		for(WebElement webElement : lstElement) {
			String nama = webElement.getText();
			System.out.println(nama);
			if (nama.equalsIgnoreCase(itemList)) {
				checkData = true;
			}
			if (nama.equalsIgnoreCase("Pinik")) {
				checkData = true;
			}
		}
		assertTrue(checkData);
		
		return checkData;
	}
	
}