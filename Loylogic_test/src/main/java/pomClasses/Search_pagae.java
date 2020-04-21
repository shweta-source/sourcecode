package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_pagae {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search;
	
	@FindBy(xpath="//span[text()='Resident Evil 6 (Xbox 360)']")
	private WebElement searchediteam;
	
	@FindBy(xpath="(//input[contains(@value, 'Add to Cart')])[1]")
	private String addtocart;
	
	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	private WebElement proceedtopay;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement login;
	
	
	public void search() throws InterruptedException 
	{
		search.sendKeys("xbox"+ Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
	}
	public void cart() throws InterruptedException
		{
		searchediteam.click();
	
	    ArrayList<String> storage = new ArrayList<String>(driver.getWindowHandles());
	    System.out.println(storage.size());
	    driver.switchTo().window(storage.get(1));
	 	
		System.out.println("check");
		Thread.sleep(5000);
		
		WebDriverWait waite = new WebDriverWait(driver,30);
		waite.until(ExpectedConditions.elementToBeClickable(By.xpath(addtocart))).click();
		
		Thread.sleep(5000);
		}
	public void payment() throws InterruptedException
	{
		proceedtopay.click();
		
		Thread.sleep(5000);
		
		email.sendKeys("abc");
		
		Thread.sleep(5000);
		
		continuebutton.click();
		
		Thread.sleep(5000);
		
		password.sendKeys("abc");
		
		Thread.sleep(5000);
		
		login.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
	
	}
	
	
//	public Search_pagae(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}

}
