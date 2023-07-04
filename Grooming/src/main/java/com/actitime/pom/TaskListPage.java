package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(className = "addNewContainer")
private WebElement addNewBtn;
@FindBy(xpath = "//div[@class='item createNewCustomer']")
private WebElement newCustomerBtn;
@FindBy(xpath = "//input[contains(@class,'inputNameField')]")
private WebElement customerNameTBX;
@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement customerDescTBX;
@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement customerDropdown;
@FindBy(xpath = "//div[text()='Big Bang Company'and @class='itemRow cpItemRow ']")
private WebElement bigBangCompany;
@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement createCustomerBtn;
@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='title']")
private WebElement customerTitle;
@FindBy(xpath="//input[@placeholder='Start typing name ...']")
private WebElement searchCustomerTBX;
@FindBy(xpath="//span[text()='HDFC']")
private WebElement hdfcBtn;
@FindBy(xpath = "//div[@class='titleEditButtonContainer']//div[@class='editButton']")
private WebElement settingsBtn;
@FindBy(xpath = "//div[@class='editCustomerPanelHeader']//div[text()='ACTIONS']")
private WebElement actionsBTN;
@FindBy(xpath = "//div[@class='taskManagement_customerPanel']//div[text()='Delete']")
private WebElement deleteBtn;
@FindBy(xpath = "//span[text()='Delete permanently']")
private WebElement deletePermanentlyBtn;
public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getSearchCustomerTBX() {
	return searchCustomerTBX;
}
public WebElement getHdfcBtn() {
	return hdfcBtn;
}
public WebElement getSettingsBtn() {
	return settingsBtn;
}
public WebElement getActionsBTN() {
	return actionsBTN;
}
public WebElement getDeleteBtn() {
	return deleteBtn;
}
public WebElement getDeletePermanentlyBtn() {
	return deletePermanentlyBtn;
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomerBtn() {
	return newCustomerBtn;
}
public WebElement getCustomerNameTBX() {
	return customerNameTBX;
}
public WebElement getCustomerDescTBX() {
	return customerDescTBX;
}
public WebElement getCustomerDropdown() {
	return customerDropdown;
}
public WebElement getBigBangCompany() {
	return bigBangCompany;
}
public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}
public WebElement getCustomerTitle() {
	return customerTitle;
}
}
