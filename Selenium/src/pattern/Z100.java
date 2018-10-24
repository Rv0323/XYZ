package pattern;

 class Z99
	{
	static int i;
	static
	{
		System.out.println("Z99.SIb");
	}
		static void test()
		{
			System.out.println("Z99.test()");
		}
	}
		public class Z100
		{
			static 
			{
				System.out.println("Z100.SIb");
			}
			public static void main(String[] args) 
			{
				System.out.println("Z100.main begin");  
				Z99.test();
				System.out.println("-----");
				System.out.println(Z99.i);
				System.out.println("-----");
				Z99.test();
				System.out.println(Z99.i);
				System.out.println("-----");
				Z99.test();
				System.out.println("Z100.main end");
				
			}
		}