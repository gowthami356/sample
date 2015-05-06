package com.practise.restapi.automation;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void test() throws URISyntaxException{
		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		System.out.println("Done FF");
		driver.quit();*/
		// mvn clean install -Pdev_brwsr_check
		URL url = ClassLoader.getSystemResource("chromedriver.exe");
		File chormeDriverPath = new File(url.toURI());
		String myTestDir = chormeDriverPath.getPath();
		
		System.setProperty("webdriver.chrome.driver", myTestDir);
		
	/*	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		String chromeProfile = "C:\\Users\\gvolete\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\";
		ArrayList<String> switches = new ArrayList<String>();
		switches.add("--user-data-dir=" + chromeProfile);
		capabilities.setCapability("chrome.switches", switches);*/
		
		WebDriver driver1 = new ChromeDriver(/*capabilities*/);
		driver1.get("https://www.google.co.in");
		System.out.println("Done Chrome");
		
	}
	
}
