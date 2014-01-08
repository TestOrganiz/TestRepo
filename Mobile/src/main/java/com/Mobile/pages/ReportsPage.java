package com.Mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportsPage extends AbstractPage {

	public ReportsPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(partialLinkText="Tranzactii")
	private WebElement transactionsSubmenu;
	
	@FindBy(css = ".btn-group-vertical a:nth-child(2)")
	private WebElement activityReportsSubmenu;
	
	
	public void clickTransactionsSubmenu() {
		transactionsSubmenu.click();
	}
	
	public void clickActivityReportsSubmenu() {
		activityReportsSubmenu.click();
	}

}
