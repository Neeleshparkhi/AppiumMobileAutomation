package Browseropen;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import tests.Baseclass;

public class BrowserInvocation extends Baseclass {
	

	public void browser() throws InterruptedException
	{
		
		    driver.get("http://115.113.181.69/TruBI/");
		    //driver.findElement(By.id("txt-userName")).click();
		    driver.findElement(By.id("txt-userName")).clear();
		    driver.findElement(By.id("txt-userName")).sendKeys("neelesh");
		    driver.findElement(By.id("txt-pwd")).click();
		    driver.findElement(By.id("txt-pwd")).clear();
		    driver.findElement(By.id("txt-pwd")).sendKeys("System@123");
		    driver.findElement(By.id("btnlogin")).click();
		    driver.findElement(By.xpath("//li[2]/a/i")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    
	}
	
	@Test
	  public void testGmailLogin() throws Exception {
	    driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	    driver.findElement(By.id("profileIdentifier")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("ekdoteen.123");
	    driver.findElement(By.xpath("//div[@id='passwordNext']/div/button/div[2]")).click();
	    driver.findElement(By.xpath("//img[contains(@src,'https://lh3.googleusercontent.com/ogw/ADGmqu_6R64l-exmuDludgabUzKgysw41D7c43y34WJuEA=s32-c-mo')]")).click();
	    driver.findElement(By.id("gb_71")).click();
	  }
	public boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	  }
}
}