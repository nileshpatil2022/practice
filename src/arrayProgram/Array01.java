package arrayProgram;

public class Array01 
{
	public static void main(String[] args) 
	{
		int a[]= {2,3,45,5};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
