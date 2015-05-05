package com.practise.restapi.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Done FF");
		driver.quit();
		// mvn clean install -Pdev_brwsr_check
		
	/*	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gvolete\\Documents\\Softwares\\chromedriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String chromeProfile = "C:\\Users\\gvolete\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfile);
		capabilities.setCapability("chrome.switches", switches);
		
		WebDriver driver1 = new ChromeDriver(capabilities);
		driver1.get("chrome-extension://fdmmgilgnpjigdojojpjoooidkmcomcm/index.html");
		System.out.println("Done Chrome");*/
		
		/*WebDriver driver2 = new InternetExplorerDriver();
		driver2.get("https://www.google.co.in");
		System.out.println("Done IE");*/
		
	}
	
}
