package demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeSuite
	public void url() {
		System.out.println("@BeforeSuite url method");
	}
	@BeforeTest
	public void login() {
		System.out.println(" @BeforeTest login method");
	}
	
	@Test(enabled=true)
	public void username() {
		System.out.println("@Test username method");
	}
	@Test
	public void password() {
		System.out.println("@Test password method");
	}
	@AfterTest
	public void logout() {
		System.out.println("@AfterTest logout method");
	}

}
