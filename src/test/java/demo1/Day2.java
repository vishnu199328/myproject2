package demo1;

import org.testng.annotations.Test;

public class Day2 {
	@Test(dependsOnMethods= {"addemplee","createyser"})
	public void homepage() {
		System.out.println("@Test homepage method");
	}
	@Test
	public void addemplee() {
		System.out.println("@Test addemployee method");
	}
	@Test
	public void createyser() {
		System.out.println("@Test create usre method");
	}
	@Test(groups= {"smoke"})
	public void buildstable() {
		System.out.println("@Test bd method");
	}

}
