package pattern;
 class z23 
	{
		static
	 	{
	 		System.out.println("z23.SIb");
	 	}
			static void test() 
			{
				System.out.println("z23.test()");
		}
	}
	 public class z22
			 {
			 static
			 {
				 System.out.println("z23.SIb");
				 
			 }
			 public static void main(String[] args) 
			 {
				 System.out.println("z.main begin");
				 z23.test();
				 System.out.println("-----");
				 z23.test();
				 System.out.println("-----");
				 z23.test();
				 System.out.println("z23.main end");
			 }
			
		}






