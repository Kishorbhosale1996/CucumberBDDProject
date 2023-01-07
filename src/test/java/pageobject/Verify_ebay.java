package pageobject;

import java.sql.DriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Verify_ebay {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement txtbox;
	
	@FindBy(xpath="//select[@class='gh-sb ']")
	WebElement listbox;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement searchbtn;
	
	@FindBy(xpath="//ul[@class='srp-results srp-list clearfix']/li[1]")
	WebElement item;
	
	public Verify_ebay(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterSearch(String txt) {
		txtbox.sendKeys("Vivo mobiles");
	}
	
	public void clickonListbox() {
	
		Select s= new Select(listbox);
		s.selectByVisibleText("Cell Phones & Accessories");
	}
	
	public void ClickonSearchbtn() {
		searchbtn.click();
	}
	
	public String Verifysuggestedname(String name) {
		
		return name=item.getText();
	}
}
