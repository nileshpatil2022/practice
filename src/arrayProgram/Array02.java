package arrayProgram;

public class Array02 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		a[0]=45;
		
		a[1]=30;
		a[2]=25;
		a[3]=63;
		a[4]=99;
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
