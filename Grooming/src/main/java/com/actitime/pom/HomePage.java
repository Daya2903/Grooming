package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//a[@class='content tasks']")
private WebElement taskTab;
@FindBy(id="logoutLink")
private WebElement logoutLink;
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getTaskTab() {
	return taskTab;
}
public WebElement getLogoutLink() {
	return logoutLink;
}

}
