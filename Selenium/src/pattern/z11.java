package pattern;

public class z11 
	{
	static int i=test();
	public static int test()
	{
		System.out.println("test:" +i);
		i=99;
		main(null);
		return 10;
	}

	public static void main(String[] args)
		{
		System.out.println("main begin:" +i);
		i=33;
		System.out.println("main end:" +i);

	}

}

//	static int i=test();
//	static
//	{
//		System.out.println("z12.SIB:"+ i);
//		i=99;
//		main(null);
//		System.out.println("z12.SIB again:"+i);
//		i=10;
//	}
//	
//	public static int test(){
//	{
//		System.out.println("test:" +i);
//		i=40;
//		main(null);
//		System.out.println("test again:"+ i);
//		return 75;
//	} 
//		}
//		public static void main(String[] args)
//		{
//		System.out.println("main begin:" +i);
//		i=33;
//		System.out.println("main end:" +i);
//		}
//	}
//		static int i= test1();
//		static int j= test2();
//		static 
//		{
//			System.out.println("SIB:" +"i:" +i+ "," +"j:"+ j); 
//			i+=1;
//			j+=i;
//			main(null);
//			System.out.println("SIB again:" + "i:" + i+ "," +"j:"+ j);
//			i+=2;
//			j+=i;
//		}
//		public static int test1()
//		{
//			System.out.println("test1:" + "i:" + i+ "," +"j:"+ j);
//			i+=3;
//			j+=i;
//			main(null);
//			System.out.println("test1 again:" + "i:" + i+ "," +"j:"+ j); 
//			i+=4;
//			j+=i;
//			return i+ j+5;
//		}
//		public static int test2()
//		{
//			System.out.println("test2:" + "i:" + i+ "," +"j:"+ j);
//			i+=6;
//			j+=i;
//			main(null);
//			System.out.println("test2 again:" + "i:" + i+ "," +"j:"+ j); 
//			i+=7;
//			j+=i;
//			return i+j+8;
//		}
//		public static void main(String[] args) 
//		{
//			System.out.println("main:" +i);
//			i+=9;
//			j+=i;
//			
//		}
//			
//		}









