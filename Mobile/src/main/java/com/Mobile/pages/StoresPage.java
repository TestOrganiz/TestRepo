package com.Mobile.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;




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
	private WebElement activateStore;
	
	@FindBy(css = "a[href*='/admin/store/deactivate']")
	private WebElement deactivateStore;
	
	@FindBy(css = ".ui-pg-selbox")
	private WebElement itemPerPageSelectionBox;
	
	public void addStore() {
		addStore.click();
	}
	
	public void editStore() {
		editStore.click();
	}
	
	public void deleteStore() {
		deleteStore.click();
	}
	
	public void activateStore() {
		activateStore.click();
	}
	
	public void deactivateStore() {
		deactivateStore.click();
	}
	
	public void verifySearchResultsContainsItem(String... terms) {
		String noOfPagesContainer = getDriver()
				.findElement(
						By.id("gridPager_center"))
				.getText().trim();
		int noOfPages = StringUtils.getAllIntegerNumbersFromString(
				noOfPagesContainer).get(1);
		for (int i = 0; i < noOfPages; i++) {
			List<WebElement> searchResults = getDriver()
					.findElements(
							By.cssSelector(".ui-widget-content.jqgrow.ui-row-ltr"));
			for (WebElement searchResult : searchResults) {
				if ($(searchResult).isCurrentlyVisible()) {
					for (String term : terms) {
						if (!searchResult.getText().toLowerCase()
								.contains(term.toLowerCase())) {
							Assert.fail(String
									.format("The '%s' search result item does not contain '%s'!",
											searchResult.getText(), term));
						}
					}
				}
			}
			if (i < noOfPages - 1) {
				getDriver()
						.findElement(
								By.cssSelector(".ui-icon.ui-icon-seek-next"))
						.click();
				waitFor(ExpectedConditions
						.textToBePresentInElement(
								By.cssSelector("gridPager_center"),
								String.format("(%d of %d)", i + 2,
										noOfPages)));
				waitABit(2000);
			}
		}
	}
}
