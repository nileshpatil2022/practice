package arrayProgram;

public class Array03 
{

	public static void main(String[] args) 
	{
		int a[]= {2,3,4,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+"-number is even");
			}
			else
			{
				System.out.println(a[i]+"-number is odd");
			}
		}
		
	}
}
