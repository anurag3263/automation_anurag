package com.scripts.actitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.actitime.BaseTest;
import com.packages.actitime.ActiTimeLoginPage;

public class ActiTimeLogin extends BaseTest {
	@Test
	public void login() throws IOException, InterruptedException
	{
		ActiTimeLoginPage act=new ActiTimeLoginPage(driver);
		act.loginMethod();
		Thread.sleep(3000);
		act.logoutMethod();
	}

}
