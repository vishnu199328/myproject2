package demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeMethod
	public void database() {
		System.out.println("@BeforeMethod database method");
	}
	
	@Test(groups= {"system"})
	public void retest() {
		System.out.println("@Test(groups= {\"system\"}) Retest method");
	}
	@Test(groups= {"smoke"})
	public void datafetch() {
		System.out.println("@Test(groups= {\"smoke\"}) datafetch method");
	}
	@AfterMethod
	public void logoutdatabase() {
		System.out.println("@AfterMethod logoutdatabase method");
	}
	@AfterSuite
	public void closemethod() {
		System.out.println("@AfterSuite close method");
	}
	

}
