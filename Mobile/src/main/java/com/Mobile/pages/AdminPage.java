package com.Mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends AbstractPage{

	public AdminPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(css = ".panel-title")
	private WebElement usersAndGroupsSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-submenu-buttons a:nth-child(1)")
	private WebElement usersSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-submenu-buttons a:nth-child(2)")
	private WebElement groupsSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-submenu-buttons a:nth-child(3)")
	private WebElement rolesSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-submenu-buttons a:nth-child(4)")
	private WebElement actionsSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-menu-buttons a:nth-child(1)")
	private WebElement currencySubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-menu-buttons a:nth-child(2)")
	private WebElement regionsSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-menu-buttons a:nth-child(3)")
	private WebElement localitiesSubmenu;
	
	@FindBy(css = ".btn-group-vertical.admin-menu-buttons a:nth-child(4)")
	private WebElement terminalTypesSubmenu;
	
	public void clickUsersAndGroupsSubmenu() {
		usersAndGroupsSubmenu.click();
	}
	
	public void clickUsersSubmenu() {
		usersSubmenu.click();
	}
	
	public void clickGroupsSubmenu() {
		groupsSubmenu.click();
	}
	
	public void clickRolesSubmenu() {
		rolesSubmenu.click();
	}
	
	public void clickActionsSubmenu() {
		actionsSubmenu.click();
	}
	
	public void clickCurrencySubmenu() {
		currencySubmenu.click();
	}
	
	public void clickRegionsSubmenu() {
		regionsSubmenu.click();
	}
	
	public void clickLocalitiesSubmenu() {
		localitiesSubmenu.click();
	}
	
	public void clickTerminalTypesSubmenu() {
		terminalTypesSubmenu.click();
	}
	
	


}
