package com.Mobile.steps;

import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps {

	public AbstractSteps(Pages pages) {
		super(pages);
		getDriver().manage().window().maximize();
		
	}
	private static final long serialVersionUID = 1L;

}
