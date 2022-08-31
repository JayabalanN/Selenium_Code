package com.mavenproject;

import org.testng.annotations.Test;

public class Trail_Class {
     @Test     
	public void aa() {
		System.out.println("Test a");
	}
     @Test(invocationCount = 3)
	public void bb() {
		System.out.println("Test b");
	}
     @Test(priority = -1)
	public void cc() {
		System.out.println("Test c");
	}
     @Test(priority = -2)
	public void dd() {
		System.out.println("Test d");
	}
     @Test(enabled = false)
	public void ee() {
		System.out.println("Test e");
	}
     @Test(dependsOnMethods = "aa")
	public void aaf() {
		System.out.println("Test f");
	}
}
