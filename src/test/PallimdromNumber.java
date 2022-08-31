package test;

public class PallimdromNumber 
{

	public static void main(String[] args) 
	{
		int a=484;
		
		int temp=a;
		
		int rev=0,rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			
			rev=rev*10+rem;
			
			temp=temp/10;
		}
		if(rev==a)
		{
			System.out.println("number is pallimdrom");
		}
		else
		{
			System.out.println("number is not pallimdrom");
		}
		
	}
}
