package Rediff;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {

	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Launch Rediff...");
	}
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close Rediff...");
	}
	@Test
	public void login()
	{
		System.out.println("login Code...");
	}
}
