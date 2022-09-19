package demo1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Day5 {
	
	@Test
	public void password() {
		System.out.println("@Test password method");
	}
	@Parameters({"sanchu","vishnu"})
	@Test
	public void userdetail(String name, String bhanu) {
		System.out.println("@Test username method");
//		System.out.println(name);
//		System.out.println(bhanu);
	}
	

}
