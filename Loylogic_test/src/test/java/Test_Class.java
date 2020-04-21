

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import utility.DriverFactory;
import pomClasses.Search_pagae;

public class Test_Class {


	@Test
	public  void autoTest() throws InterruptedException
	{
		WebDriver driver = DriverFactory.driverInitializer("https://www.amazon.in/");
		
		Search_pagae sp= PageFactory.initElements(driver, Search_pagae.class);
		
		sp.search();
		sp.cart();
		sp.payment();
		
	}
	
	
}
