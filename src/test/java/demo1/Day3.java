package demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeMethod
	public void cloud() {
		System.out.println("@BeforeMethod cloud method");
	}
	
	@Test(groups= {"smoke"})
	public void buildstable_Retest() {
		System.out.println("@Test group buildstable_Retest method");
	}
	@Test(groups= {"system"})
	public void server_Coverage() {
		System.out.println("@Test(groups= {\"system\"}) server_Coverage method");
	}
	@AfterMethod
	public void logoutcloud() {
		System.out.println("@AfterMethod logoutcloud method");
	}
	

}
