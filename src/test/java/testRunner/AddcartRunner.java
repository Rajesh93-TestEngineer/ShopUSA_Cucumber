package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\MyProjects\\ShopUSA_Cucumber\\src\\test\\resource\\Feature\\AddCart.feature",
		          glue={"stepDefination"},
		          plugin={"pretty","html:target/myReports/logins.html"},
		         
                  monochrome=true)
                  
public class AddcartRunner {

}
