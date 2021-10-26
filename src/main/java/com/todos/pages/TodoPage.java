package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	/*Locators*/
	final static String INPUT_FIELD = "//input[@ng-model=\"newTodo\"]";
	
	/*@FindBy*/
	@FindBy(how = How.XPATH, using = INPUT_FIELD)
	public static WebElement inputText;
	
	/*Methods*/
	public void submitTodo(String todo) {
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
		
	}

	public Boolean isElementDisplayed (WebElement element)
	{
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
	
	
}
