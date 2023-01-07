package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageobject.Verify_ebay;
import pageobject.Verify_ebay_filter;

public class step_def {

	public WebDriver driver;
	public Verify_ebay ebay;
	public Verify_ebay_filter ebayfilter;
@Given("User Launch Chrome Browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	ebay = new Verify_ebay(driver);
   
	ebayfilter=new Verify_ebay_filter(driver);
}

@When("User open URL {string}")
public void user_open_url(String url) {
	
    driver.get(url);
    
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}

@When("User enters {string} in searchbox")
public void user_enters_in_searchbox(String string) {
	
	ebay.EnterSearch(string);
    
}

@When("User seach with {string}")
public void user_seach_with(String string) {
    ebay.clickonListbox();
}

@When("Click on Search")
public void click_on_search() {
	ebay.ClickonSearchbtn();
    
}

@Then("verify page is loaded with {string}")
public void verify_page_is_loaded_with(String string) {
    

	
JavascriptExecutor js = (JavascriptExecutor)driver;
if(js.executeScript("return document.readyState").toString().equals("complete")) {
	
	Assert.assertTrue(true);
}else {
	Assert.assertTrue(false);
}
	
}

@Then("Verify first result name matches with search string {string}")
public void verify_first_result_name_matches_with_search_string(String name) {
String exp="Vivo";
	ebay.Verifysuggestedname(name);
	
	if(name.equals(exp)) {
		
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
}

//////////////scenario 2: search product using filter//////////////////////

	@Then("Navigate to search by category")
	public void navigate_to_search_by_category() {
		
	    ebayfilter.navigate_to_shopbycategory();
	}

	@Then("Go to electronics")
	public void go_to_electronics() {
		
		ebayfilter.clickonCellPhone_accessories();
	    
	}

	@Then("click on Cell Phones & Smartphones")
	public void click_on_cell_phones_smartphones() {
	    
		ebayfilter.clickonsearch_Cellphone_smartphone();
	}

	@Then("click on See All option")
	public void click_on_see_all_option() {
		
		ebayfilter.click_on_See_All();
	    
	}

	@Then("apply  filter1")
	public void apply_filter1() {
	    
		ebayfilter.click_on_filter1();
		ebayfilter.click_on_checkbox1();
	}

	@Then("apply filter2")
	public void apply_filter2() {
	    
		ebayfilter.click_on_filter2();
		ebayfilter.click_on_checkbox2();
		ebayfilter.click_on_checkbox3();
	}

	@Then("apply filter3")
	public void apply_filter3() {
		
		ebayfilter.click_on_filter3();
		ebayfilter.click_on_checkbox4();
	   
	}


	@Then("click on apply")
	public void click_on_apply() {
		
		ebayfilter.click_on_ApplyFilterbtn();
	}

	@Then("verify that filter tags are applied")
	public void verify_that_filter_tags_are_applied(String act) {
	   String exp = "3 filters applied";
		ebayfilter.Verify_filter(act);
		
		
		if(act.equals(exp)) {
			
			Assert.assertEquals(true,"Filter is applied");
			
		}else {
			
			Assert.assertEquals(false, "filter is not applied");
		}
	}





	
}
