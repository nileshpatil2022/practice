package testNG;

import org.testng.annotations.Test;



public class Demo01 
{   @Test
	public void m1()
	
	{
	
	  System.out.println("test1");

		
	}

@Test(groups= {"test"})
public void m2()

{

  System.out.println("test2");
	
}

@Test
	public void m3()
	
	{
	
	  System.out.println("test3");

		
	}

}
