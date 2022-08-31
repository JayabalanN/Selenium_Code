package com.mavenproject;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_xml_Run {
	
   @Test
   @Parameters({"age","name"})
	public void test (int age,String name) {
		System.out.println(age);
		System.out.println(name);
		

}
}