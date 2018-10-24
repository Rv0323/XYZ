package pattern;

public class z5
	
	{
		static int x= test();
		static int y=test();
		static int test()
		{
			System.out.println("test:" + x + "," + y);  //default value
			return x+y+10;
		}
		public static void main(String[] args)
		{
			System.out.println(x);
			System.out.println(y);
		}
			
	}


