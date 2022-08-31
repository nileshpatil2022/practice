package arrayProgram;

public interface Interface 
{
	public void m1();
	
	public static void m2()
	{
		System.out.println("hiii");
	}
	
	public default void m3()
	{
		System.out.println("bye");
	}

}
