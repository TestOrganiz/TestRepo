package com.Mobile.pages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TemplatePage extends AbstractPage{

	public TemplatePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css="div[class*='header-text'] a:nth-child(1)")
	private WebElement mainPageLbl;
	
	@FindBy(css="div[class*='header-text'] a:nth-child(2)")
	private WebElement myAccountLbl;
	
	@FindBy(css="div[class*='header-text'] a:nth-child(3)")
	private WebElement signOutLbl;

	@FindBy(css="a[class*='navbar-brand']")
	private WebElement mobileDistributionLbl;
	
	@FindBy(css="a[href='/admin/supplier']")
	 private WebElement suppliersMenu;
	
	@FindBy(css="a[href='/admin/client']")
	private WebElement clientsMenu;
	
	@FindBy(css="a[href='/admin/report']")
	private WebElement reportsMenu;
	
	@FindBy(css="a[href='/admin/admin']")
	private WebElement adminMenu;
	
	@FindBy(css="form[class*='navbar-form navbar-right'] input[class*='form-control col-md-8']")
	private WebElement searchTxt;
	
	@FindBy(css="div[class*='footer-text'] a:nth-child(1)")
	private WebElement termsOfUseLbl;
	
	@FindBy(css="div[class*='footer-text'] a:nth-child(2)")
	private WebElement helpLbl;
	
	@FindBy(css="div[class*='footer-text'] a:nth-child(3)")
	private WebElement contactLbl;
	
	public void clickMainPage()
	{
		element(mainPageLbl).click();
	}
	
	public void clickMyAccount()
	{
		element(myAccountLbl).click();
	}
	
	public void clickSignOut()
	{
		element(signOutLbl).click();
	}
	
	public void clickMobileDistribution()
	{
		element(mobileDistributionLbl).click();
	}
	
	public void clickSuppliers()
	{
		element(suppliersMenu).click();
	}
	
	public void clickClients()
	{
		element(clientsMenu).click();
	}
	
	public void clickReports()
	{
		element(reportsMenu).click();
	}
	
	public void clickAdmin()
	{
		element(adminMenu).click();
	}

	public void typeSearch(String searchKeywords)
	{
		element(searchTxt).type(searchKeywords);
	}
	
	public void clickTermsOfUse()
	{
		element(termsOfUseLbl).click();
	}
	
	public void clickHelp()
	{
		element(helpLbl).click();
	}
	
	public void clickContact()
	{
		element(contactLbl).click();
	}

}
