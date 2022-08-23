package arrayProgram;

public class DuplicateArrayNumber 
{
	public static void main(String[] args) 
	{
		
		int a[]= {12,15,56,12,45,56,8};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate = "+a[i]);
				}
			}
		}
		
	}

}
