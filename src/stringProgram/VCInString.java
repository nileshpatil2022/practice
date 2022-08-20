package stringProgram;

public class VCInString 
{
	public static void main(String[] args) 
	{
		String a="nilesh";
		int v=0,c=0;
		
		char b;
		
		for(int i=0;i<a.length();i++)
		{
			b=a.charAt(i);
			
			if(b=='i' || b=='e' )
			{
				v++;
				System.out.println("V -"+b);
			}
			else
			{
				c++;
				System.out.println("C -"+b);
			}
		}
		System.out.println(v);
		System.out.println(c);
	}

}
