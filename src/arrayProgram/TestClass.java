package arrayProgram;

import org.testng.annotations.Test;

public class TestClass 
{
	@Test
	public void m1()
	{
		System.out.println("test 1");
	}

	@Test(groups= {"test"})
	public void m2()
	{
		System.out.println("test 2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("test 3");
	}
	
	@Test
	public void m4()
	{
		System.out.println("test 4");
	}
}
