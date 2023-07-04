package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}
	public FileUtility fileUtils = new FileUtility();
	public WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void openBrowser(String browser) throws IOException {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();	
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = fileUtils.readPropertyData("url");
		driver.get(url);
	}
	@AfterClass
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		LoginPage l = new LoginPage(driver);
		String un = fileUtils.readPropertyData("username");
		String pwd = fileUtils.readPropertyData("password");
		l.setLogin(un, pwd);
	}
	@AfterMethod
	public void logout() {
		HomePage h = new HomePage(driver);
		h.getLogoutLink().click();
	}
}
