package globbing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCasesGlobbing {
	
	@Test
	public void testcase_02()  {
		//Test Case Description: Making  Web Site content to Armenian
		// Steps:
		//1.Navigate to www.globbing.am 
		//2.Click on the flag button	
		//3.Click on Armenian flag
		//openned web page content without making to Armenian,it was already in Armenian,because of it 2nd and 3rd steps wasn`t passed.
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://globbing.com");
        driver.findElement(By.xpath("//form[@class='language--form f_languageForm']/div[@class='field--select f_field--select active']")).click();
		driver.findElement(By.xpath("//input[@id='language_3']")).click();
		
		
	}
}
