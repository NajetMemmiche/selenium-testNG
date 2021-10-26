package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup{

	public AddTodoTest() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		boolean todoText= todoPage.isElementDisplayed(TodoPage.inputText);
		Assert.assertTrue(todoText);
		todoPage.submitTodo(prop.getProperty("todo1"));
	}

}