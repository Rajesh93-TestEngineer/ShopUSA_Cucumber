package stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddcartFun {
	
	WebDriver driver;
	@Before
	public void setUp() {
		ChromeOptions options=new ChromeOptions();
	       options.addArguments("--remote-allow-origins=*");
		   driver=new ChromeDriver(options);
		   driver.get("https://www.hollisterco.com/shop/wd");
		   driver.manage().window().maximize();
		System.out.println("open the application");
	}
	@After
	public void tearDown() {
		driver.close();
		System.out.println("close the browser");
	}
	
//	@Given("open browser on ShopUSA")
//	public void open_browser_on_shop_usa() {
//		
//	   driver.get("https://www.hollisterco.com/shop/wd");
//	   driver.manage().window().maximize();
//	}

	@When("click on Mens wear")
	public void click_on_mens_wear() {
	    Actions ac=new Actions(driver);
	    ac.moveToElement(driver.findElement(By.id("cat-label-12551"))).perform();
	}

	@When("click on Juckets and coats")
	public void click_on_juckets_and_coats() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='cat-16400-largescreen']")).click();
	}

	@When("select on product")
	public void select_on_product() {
	WebElement btn=driver.findElement(By.id("55102994__KIC_332-4027-0019-201__swatch"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",btn);
    
	}

	@Then("click on size")
	public void click_on_size() throws InterruptedException {
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[@class='tile-text'])[6]")).click();
	   
	   Thread.sleep(3000);
	   Select st=new Select(driver.findElement(By.name("quantity")));
	   st.selectByVisibleText("2");	   
	}

	@Then("click on AddBag")
	public void click_on_add_bag() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.navigate().back();
	    
	}
	// Jeans

@When("click on jeans then on click on joggers")
public void click_on_jeans_then_on_click_on_joggers() {
	Actions ac=new Actions(driver);
	System.out.println("jeans");
	 WebElement joggerlink=driver.findElement(By.xpath("(//a[@href=\"/shop/wd/mens-bottoms-denim-jogger-jeans\"])[3]"));

   ac.moveToElement(driver.findElement(By.xpath("//li[@data-catid=\"130737\"]/a/span"))).perform();
   JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].click();",joggerlink);
}
@When("select on image")
public void select_on_image()throws Exception {
	
  WebElement img=  driver.findElement(By.xpath("//img[@alt='Twill Cargo Joggers, Black']"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",img);
}

@Then("click on image size") 
public void click_on_image_size() throws InterruptedException {
   driver.findElement(By.xpath("(//span[@class='tile-text'])[4]")).click();
   Thread.sleep(3000);
   Select st=new Select(driver.findElement(By.id("product-quantity-dropdown_53279977_")));
   st.selectByVisibleText("3");
}

@Then("clicks on AddBag")
public void clicks_on_add_bag() throws InterruptedException {
	WebElement regularbtn=driver.findElement(By.xpath("(//span[@class='tile-text'])[7]"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("arguments[0].click();",regularbtn);
    System.out.println("click on regular length success");
//	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
    WebElement Addbtn=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", Addbtn);
    System.out.println("Addbag completed");
    Actions ac=new Actions(driver);
    ac.moveToElement(driver.findElement(By.xpath("//li[@data-aui=\"shopping-bag-nav\"]"))).perform();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[@class='button viewBag-button']")).click();
//  driver.findElement(By.xpath("(//button[@data-variant=\"square\"])[2]")).click();
//  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
//  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(
//    		                 "(//button[@data-variant=\"square\"])[2]"))));
    List<WebElement> ele= driver.findElements(By.xpath("//button[@class='icon-button']"));
    int count=0;
    for (int i = 0; i < ele.size(); i++) {
    
        if(count==3) {
        	ele.get(i).click();
        }
		
	}
    count++;
    }
//ActiveWear
@When("perform active wear")
public void perform_active_wear() {
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.xpath("//li[@id='cat-610547442-largescreen']/a/span"))).perform();
WebElement btn=driver.findElement(By.xpath("(//a[@href='/shop/wd/activewear-mens-activewear'])[2]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", btn);
}

@Then("click on image")
public void click_on_image() {
	WebElement btn=driver.findElement(By.xpath("//img[@alt=\"Gilly Hicks Active Nylon Blend Shorts, Olive\"]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", btn);
}

@Then("click on sizeguide")
public void click_on_sizeguide() {
    driver.findElement(By.xpath("(//button[@data-variant=\"button-as-link\"])[4]")).click();
}

@Then("printing webTable of sizeguide")
public void printing_web_table_of_sizeguide() throws Exception{
	Thread.sleep(3000);
	List<WebElement> Count_Columns=driver.findElements(By.xpath("(//table[@class='size-guide__guide size-guide__show-inches'])[2]/tbody/tr/th"));
	System.out.println("no of coulumns"+" "+Count_Columns.size());
	
	List<WebElement> Count_rows=driver.findElements(By.xpath("(//div[@class=\"size-guide__table-scroll-wrapper\"])[2]//table//tr"));
	System.out.println("no of rows"+" "+Count_rows.size());
	
	List<WebElement>Rows_Colums=driver.findElements(By.xpath("(//table[@class='size-guide__guide size-guide__show-inches'])[2]/tbody/tr/td"));
	System.out.println("no of rows and columns"+" "+Rows_Colums.size());
	 
	for (int i = 0; i <=Count_rows.size() ; i++) {
		for (int j = 0; j <=Count_Columns.size()-5 ; j++) {
			Thread.sleep(3000);
	WebElement data=driver.findElement(By.xpath(
	 "(//table[@class='size-guide__guide size-guide__show-inches'])[2]/tbody/tr["+i+"]/td["+j+"]"));	
		System.out.print(data.getText()+" ");
		}
		System.out.println();
	}
}
@When("To perform mens")
public void to_perform_mens() {
	 Actions ac=new Actions(driver);
	    ac.moveToElement(driver.findElement(By.id("cat-label-12551"))).perform();
	    System.out.println("mouse over perform mens wear");
}

@Then("click on Polos")
public void click_on_polos() throws InterruptedException {
	Thread.sleep(3000);
driver.findElement(By.xpath("//li[@id='cat-88196-largescreen']/a")).click();
System.out.println("click on polos completed");
}

@Then("click on Quick view")
public void click_on_quick_view() {
	 Actions ac=new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("//button[@class='button product-card__button--qv-aui catalog-productCard-module__quickview']"))).perform();
   driver.findElement(By.xpath("//button[@class='button product-card__button--qv-aui catalog-productCard-module__quickview']")).click();
   System.out.println("click on Quick view complted");
}

@Then("click on Quick view closed")
public void click_on_quick_view_closed() {
  driver.findElement(By.xpath("(//button[@class='modal-close-button js-close-modal'])[1]")).click(); 
System.out.println("quick view is closed");
}

}
