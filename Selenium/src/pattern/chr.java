package pattern;

public class chr
	{
//		public static void main(String[] args)
//			{
//			System.out.println("a\u0009b");
//			
//			}
//	
//		static void test()
//		{
//			System.out.println(i); 
//		
//			 i=2000;
//		}
//		static int i=10;
//			public static void main(String[] args) 
//			{
//				System.out.println(i); 
//				test();
//				System.out.println(i); 
//			}
//	
	
//		static int i= test();
//		static int test()
//		{
//			return 10;
//			
//		}
//		 public static void main(String[] args) 
//		 	{
//			 System.out.println(i); 
//			System.out.println(test());
//			System.out.println(i); 
//			
//		}
	
//	static int i= 10;
//	static int j=i;
//	public static void main(String[] args) 
//		{
//		System.out.println(i);
//		System.out.println(j);
//	}
	
//	static int j= i;
//	static int i=10;								//illegal because it should be initiallized before
//	public static void main(String[] args) 
//		{
//		System.out.println(i);
//		System.out.println(j);
//			}
//		}


//
//	static int i= 10;
//	static int j;
//	static int k=j;
//	static int m=i;
//	static int n= i+ j+ k+ m;
//	public static void main(String[] args) 
//		{
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//		System.out.println(m);
//		System.out.println(n); 
	

//	static int i= 10;
//	static int j=i + k;
//	static int k;
//	
//	public static void main(String[] args) 
//		{
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(k);
//
//		}
//	}
//	static int x= 10;
//	
//	static int y= test();
//	static int test()
//	{
//		return 40;
//	}
//	
//	public static void main(String[] args) 
//		{
//		System.out.println(x);
//		System.out.println(y);
//		}
//	}
		
//static int x= 10;
//	
//	static int y= test();
//	static int test()
//	{
//		return x;
//	}
//	
//	public static void main(String[] args) 
//		{
//		System.out.println(x);
//		System.out.println(y);
//		}
//	}
		
//				static int x= test();
//			
//			static int y= 20;
//			static int test()
//			{
//				return y;
//			}
//			
//			public static void main(String[] args) 
//				{
//				System.out.println(x);
//				System.out.println(y);
//				}
//			}
//		
//	static int x;
//	
//	static int y= 20;
//	static int test()
//	{
//		return y;
//	}
//	
//	public static void main(String[] args) 
//		{
//		System.out.println(x);
//		System.out.println(y);
//		}
//	}
//			static int x;
//		
//		static int y= test();
//		static int test()
//		{
//			return y;
//		}
//		
//		public static void main(String[] args) 
//			{
//			System.out.println(x);
//			System.out.println(y);
//			}
//		}
	
	
	
	static int x= test();
	static int y=10;
	static int test()
	{
		System.out.println("test:" + x + "," + y);  //default value
		return y;
	}
	public static void main(String[] args)
	{
		System.out.println(x);
		System.out.println(y);
	}
	}
	
	// static member are loaded once while class is loading. it get executed only once
	
	
	
	
	
	
	
	
	
	