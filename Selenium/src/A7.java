
 class A7 
	{
	static int i;
	static
	{
		System.out.println("A7.SIB");
	}
	public class A8
	{
		static {
			System.out.println("A8.SIB");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println("main begin");
		System.out.println(A7.i); 
		System.out.println("main end");
		
	}
	
}
