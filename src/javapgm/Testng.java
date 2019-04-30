package javapgm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	@BeforeClass 
	private void launchBrowser() {
		// TODO Auto-generated method stub
		System.out.println("launch");

	}
	@AfterClass
	private void cosebrowser() {
		// TODO Auto-generated method stub
	System.out.println("close");
	}

	@BeforeMethod

	private void starttime() {
		// TODO Auto-generated method stub
	System.out.println("starttime");

	}
	@AfterMethod
	private void endTime() {
		// TODO Auto-generated method stub
	System.out.println("emd");
	}


	@Test
	private void test1() {
		// TODO Auto-generated method stub
	System.out.println("test1");
	}

	@Test

	private void test2() {
		// TODO Auto-generated method stub
	System.out.println("test2");
	}
	}


