package stringProgram;

public class FirstProgram 
{
	public static void main(String[] args) 
	{
		String a="Testing java";
		
		String b="Software";
		
		System.out.println(a.length());
		
		System.out.println(b.concat(" "+a));
		
		System.out.println(a.toUpperCase());
		
		System.out.println(a.toLowerCase());
		
		System.out.println(a.charAt(0));
		
		System.out.println(a.charAt(5));
		
		System.out.println(a.endsWith("g"));
		
		System.out.println(a.equalsIgnoreCase("TESTING"));
		
		System.out.println(a);
		System.out.println(a.trim());
		
		System.out.println(a);
		
		System.out.println(a.substring(1));
		
		System.out.println(a.substring(1, 5));
		
		
		
	}

}
