package cloud;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AmazonAzure {
	
		
	    
		@Test
		public void amazon() throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\SACHIN\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			;
			
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13 pro max");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.findElement(By.linkText("Apple iPhone 13 Pro Max (128GB) - Sierra Blue")).click();
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor)driver;	
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Delete']")).click(); 
			JavascriptExecutor js1=(JavascriptExecutor)driver;	
			js1.executeScript("window.scrollBy(0,10000)");
			driver.findElement(By.linkText("English")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//body/div[@id='a-page']/div[2]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/label[1]/i[1]")).click();
		
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/span[2]/span[1]/input[1]")).click();
		}
		
		@Test
		public void api()
		{

			RestAssured.baseURI="https://demoqa.com/BookStore/v1";
		
			RequestSpecification httpRequest=RestAssured.given();
			Response response=httpRequest.request(Method.GET,"/Books");
			
			System.out.println("Status received => " + response.getStatusLine());
	        System.out.println("Response=>" + response.prettyPrint());
		}
	

}
