package arrayProgram;

public class InterfaceImp implements Interface
{

	@Override
	public void m1() {
   System.out.println("hello");		
	}
	
	
	
	public static void main(String[] args) {
		InterfaceImp n= new InterfaceImp();
		
		n.m1();
		
		n.m3();
		Interface.m2();
		
	}

}
