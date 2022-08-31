package keywordTestNG;

import org.testng.annotations.Test;

public class Demo01 
{ 
	@Test(groups= {"T"})
	public void m1()
	{
		System.out.println("test 1");
	}

	@Test
	public void m2()
	{
		System.out.println("test 2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("test 3");
	}
}
