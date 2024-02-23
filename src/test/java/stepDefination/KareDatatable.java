package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class KareDatatable {
	WebDriver driver;
	@Given("open browser kareclouds")
	public void open_browser_kareclouds() {
		ChromeOptions options=new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		    driver.get("https://hms.kareclouds.com/site/login");
	}

	@When("User enter login Function")
	public void user_enter_login_function() {
		driver.findElement(By.id("email")).sendKeys("superadmin@gmail.com");  
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("Click on pathology")
	public void click_on_pathology() {
		driver.findElement(By.xpath("//span[contains(text(),'Pathology')]")).click();
	    	}

	@Then("Serach on Patientnames")
	public void serach_on_patientnames( io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> data=dataTable.asList();
		for (int i = 0; i < data.size(); i++) {
		driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(data.get(i));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"search\"]")).clear();

		}
	   	}
}
