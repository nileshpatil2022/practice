package arrayProgram;

public class Prime 
{

	public static void main(String[] args) 
	{
		int a=17;
		int c=0;
		for(int i=1;i<=17;i++)
		{
			if(a%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println("prime");
		}
		
	}
}
