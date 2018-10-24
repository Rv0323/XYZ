package pattern;

public class methods 
	{
		public static void test1()
		{
			System.out.println("test1 begin");
			test2();
			System.out.println("test1 end");
		}
			
		public static void main(String[] args)
		{
			System.out.println("Begin");
			test1();
			System.out.println("End");
		}
		public static void test2()
		{
			System.out.println("test2 begin");
			System.out.println("test2 end");
		}
		
}
