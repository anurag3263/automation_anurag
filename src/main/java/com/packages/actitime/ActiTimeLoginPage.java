package com.packages.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.actitime.AutoConstant;
import com.generics.actitime.ExcelLibrary;

public class ActiTimeLoginPage implements AutoConstant {

	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmeloginCheckoox;
	
	@FindBy(id = "loginButton")
	private WebElement Loginbutton;
	
	@FindBy(id = "logoutLink")
	private WebElement logoutButton;
	
	public  ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException
	{
	usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 0));	
	passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 1, 1));
	keepmeloginCheckoox.click();
	Loginbutton.click();
	}
	public void logoutMethod()
	{
		logoutButton.click();
		
	}
}
