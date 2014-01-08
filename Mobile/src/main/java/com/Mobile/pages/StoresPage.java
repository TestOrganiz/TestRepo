package com.Mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StoresPage extends  AbstractPage {

	public StoresPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(css = "a[href*='/admin/store/add']")
	private WebElement addStore;
	
	@FindBy(css = "a[href='/admin/store/edit']")
	private WebElement editStore;
	
	@FindBy(css = "a[href*='/admin/store/delete']")
	private WebElement deleteStore;
	
	@FindBy(css = "a[href*='/admin/store/activate']")
	private WebElement activateStoreStore;
	
	@FindBy(css = "a[href*='/admin/store/deactivate']")
	private WebElement deactivateStore;
}
