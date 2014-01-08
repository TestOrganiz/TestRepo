package com.Mobile.pages;

import net.thucydides.core.annotations.findby.FindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClientsSubmenuPage extends AbstractPage {

	public ClientsSubmenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css="a[href='/admin/client']")
	private WebElement clientsSubmenu ;

	@FindBy(css="a[href='/admin/store']")
	private WebElement storesSubmenu;
	
	@FindBy(css="a[href='/admin/terminal']")
	private WebElement terminalsSubmenu;
	
	@FindBy(css="a[href='/admin/client/add']")
	private WebElement addClientBtn;
	
	@FindBy(css="a[href='/admin/client/edit']")
	private WebElement editClientBtn;
	
	@FindBy(css="a[href='/admin/store/delete']")
	private WebElement deleteClientBtn;
	
	@FindBy(css="a[href='/admin/store/activate']")
	private WebElement activateClientBtn;
	
	@FindBy(css="a[href='/admin/store/deactivate']")
	private WebElement deactivateClientBtn;	
	
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
	
	public void addClient()
	{
		element(addClientBtn).click();
	}
	
	public void editClient()
	{
		element(editClientBtn).click();
	}
	
	public void deleteClient()
	{
		element(deleteClientBtn).click();
	}
	
	public void activateClient()
	{
		element(activateClientBtn).click();
	}
	
	public void deactivateClient()
	{
		element(deactivateClientBtn).click();
	}
	
	
}
