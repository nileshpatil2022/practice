package stringProgram;

public class ReplaceSpaces 
{
	public static void main(String[] args) 
	{
     String a="RAHUL PATIL";
		
		
		
	 String b[]=a.split(" ");
	 
	 System.out.println(b.length);
	 
	 for(int i=b.length-1;i>=0;i--)
	 {
		System.out.print(b[i]+" ");
		
	 }
	
	

    }
}