package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify_ebay_filter {
	
	@FindBy(xpath="//button[@class='gh-control']")
	WebElement category;

	@FindBy(xpath="//a[text()='Cell phones & accessories']")
	WebElement link;
	
	@FindBy(xpath="//a[text()='Cell Phones & Smartphones']")
	WebElement cellphone;
	
	@FindBy(xpath="(//button[@class='btn btn--small'])[1]")
	WebElement seeall;
	
	@FindBy(xpath="//span[text()='Screen Size']")
	WebElement screenSize;
	
	@FindBy(xpath="//input[@id='c3-subPanel-Screen%20Size_6%20in%20or%20More_cbx']")
	WebElement chbx;
	
	@FindBy(xpath="(//div[@class='x-overlay-aspect '])[22]")
	WebElement price;
	
	@FindBy(xpath="//input[@class='x-textrange__input x-textrange__input--from']")
	WebElement chbx1;
	
	@FindBy(xpath="//input[@class='x-textrange__input x-textrange__input--to']")
	WebElement chbx2;
	
	@FindBy(xpath="(//div[@class='x-overlay-aspect '])[24]")
	WebElement itemLocation;
	
	@FindBy(xpath="(//span[@class='radio field__control rbx x-refine__single-select-radio'])[4]")
	WebElement chbx3;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement apply;
	
	@FindBy(xpath="(//button[@class='x-flyout__button'])[1]")
	WebElement verifyfilter;
	
	public Verify_ebay_filter(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void navigate_to_shopbycategory() {
		category.click();
	}
	
	public void clickonCellPhone_accessories() {
		link.click();
	}
	
	public void clickonsearch_Cellphone_smartphone() {
		cellphone.click();
	}
	
	public void click_on_See_All() {
		seeall.click();
	}
	
	public void click_on_filter1() {
		screenSize.click();
	}
	
	public void click_on_checkbox1() {
		chbx.click();
	}
	
	public void click_on_filter2() {
		price.click();
	}
	public void click_on_checkbox2() {
		chbx1.sendKeys("10000");
	}
	public void click_on_checkbox3() {
		chbx2.sendKeys("20000");
	}
	public void click_on_filter3() {
		itemLocation.click();
	}
	
	public void click_on_checkbox4() {
		chbx3.click();
	}
	
	public void click_on_ApplyFilterbtn() {
		apply.click();
	}
	
	public String Verify_filter(String act1) {
		String act = verifyfilter.getText();
		return act;
	}
}


