package com.actitime.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class EndToEnd extends BaseClass{
	@Test(enabled=false)
public void createCustomer() throws Exception {
		HomePage h=new HomePage(driver);
		h.getTaskTab().click();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerBtn().click();
		String name = fileUtils.readExcelData("CreateCustomer", 1, 2);
		t.getCustomerNameTBX().sendKeys(name);
		String description = fileUtils.readExcelData("CreateCustomer", 1, 3);
		System.out.println(description);
		t.getCustomerDescTBX().sendKeys(description);
		t.getCustomerDropdown().click();
		t.getBigBangCompany().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(5000);
		String title = t.getCustomerTitle().getText();
		String expectedTitle="HDFC_001";
		Assert.assertEquals(title, expectedTitle);
	}
	@Test(enabled=false)
	public void deleteCustomer() throws InterruptedException {
		Thread.sleep(15000);
		HomePage h=new HomePage(driver);
		h.getTaskTab().click();
		TaskListPage t = new TaskListPage(driver);
		t.getSearchCustomerTBX().sendKeys("HDFC");
		t.getHdfcBtn().click();
		t.getSettingsBtn().click();
		t.getActionsBTN().click();
		t.getDeleteBtn().click();
		t.getDeletePermanentlyBtn().click();
	}
	@Test
	public void print() {
		System.out.println("Browser has been trigerred");
	}
}























