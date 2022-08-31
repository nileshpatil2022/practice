package test;

public class PrimeNumber 
{
	
	public void m1()
	{
		int count=0;
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			else
			{
				count=0;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		PrimeNumber  n=new PrimeNumber ();
		n.m1();
		
	}
	
	

}
