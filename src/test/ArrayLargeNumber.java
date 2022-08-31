package test;

public class ArrayLargeNumber 
{
	public static void main(String[] args) 
	{
		String a=" nilesh patil hghjjjjo";
	
		char c;
		int count=0;
		int co=0;
		for(int i=0;i<a.length();i++)
		{
			c=a.charAt(i);
			
			if(c!=' ')
			{
				count++;
			}
			else
			{
			 co++;
			}
		}
		System.out.println(count);
		System.out.println(co);
		
		
	}

}
