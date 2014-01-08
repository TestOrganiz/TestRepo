package com.Mobile.pages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsPage extends AbstractPage{

	public ClientsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="a[href='/admin/client']")
	private WebElement clientsSubmenu ;

	@FindBy(css="a[href='/admin/store']")
	private WebElement storesSubmenu;
	
	@FindBy(css="a[href='/admin/terminal']")
	private WebElement terminalsSubmenu;
	
	public void clickClientsSubmenu()
	{
		element(clientsSubmenu).click();
	}
	
	public void clickStoresSubmenu()
	{
		element(storesSubmenu).click();
	}
	
	public void clickTerminalsSubmenu()
	{
		element(terminalsSubmenu).click();
	}

}
