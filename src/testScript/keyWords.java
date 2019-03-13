package testScript;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class keyWords {
	 static FirefoxDriver driver;
	 static Properties prop;
	 static FileInputStream input;
	 static Select s;
	
	 
	public void openbrowser(String objectname) throws Exception
	{
	 driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 prop =new Properties();
	 input = new FileInputStream("C:\\Users\\kiit\\workspace\\demoCRMFrameWork_ZOHO\\objectreposatory.properties");
	 prop.load(input);
	}
    
	public void loginpage(String objectname)
	{
		driver.get(objectname);
	}
	public void input(String objectname,String data)
	{
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(data);
	}
	public void click(String objectname)
	{
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
	}
	
	public String check(String objectname)
	{
		String actual=driver.findElement(By.xpath(prop.getProperty(objectname))).getTagName();
	   // System.out.println(actual);
		return actual;
	}

}
