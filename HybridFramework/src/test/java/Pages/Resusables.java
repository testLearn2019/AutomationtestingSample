package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resusables {

	WebDriver driver;
	Properties prop;
	public void browerSetup(){
		System.setProperty("webdriver.chrome.driver", "E:\\SeleniumProjects\\HybridFramework\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(readProperties("appURL"));
	}
	
	
	
	public String  readProperties(String property){
		//---------------Setting the file path in properties--------> 
		File file = new File("E:\\SeleniumProjects\\HybridFramework\\ObjectRepository\\ObjectRepository.properties");
		//----------Converting into byte to read the file-------------------------->////
		try{
			FileInputStream inputstream = new FileInputStream(file);
             prop = new Properties();
             prop.load(inputstream);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return property;
	}
	
}
