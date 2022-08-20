package stringProgram;

public class SecondProgram 
{
	public static void main(String[] args) 
	{
		String a="Testing";
		
		String b="";
		
		char c;
		
		for(int i=a.length()-1;i>=0;i--)
		{
			c=a.charAt(i);
			
			b=b+c;
		}
		System.out.println(b);
		
		
	}

}
