package test_ng_package;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A
{
	
	@Test(priority=1)
	public void f2()
	{
		System.out.println("method f2");
	}
	@Test (priority=2)
	public void f3()
	{
		System.out.println("method f3");
	}



}
