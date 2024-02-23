package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;

public class SearchonProduct {
	WebDriver driver;
	@Given("Launch Browser on holistar")
	public void launch_browser_on_holistar() {
		ChromeOptions options=new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(options);
		   driver.get("https://www.hollisterco.com/shop/wd");
		   driver.manage().window().maximize();
	}

	@When("^Search on products(.*)$")
	public void search_on_products(String name) throws InterruptedException {
	    driver.findElement(By.xpath("(//div[@data-testid=\"search-toaster-button\"])[2]")).click();
	    System.out.println("next stmt1");
	    driver.findElement(By.id("search-input-field")).sendKeys(name);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@class='button' and @type='submit']")).click();
	}

}
