package pattern;

class Z20 
 	{
	 	static int i=10;
	 	static
	 	{
	 		System.out.println("Z19.SIb:" +i); 
	 		i=20;
	 	}

 	}
 		public class Z19
 		 {
 		 static
 		 {
 			 System.out.println("Z20.SIb");
 			 
 		 }
 		 public static void main(String[] args) 
 		 {
 			 System.out.println("main begin");
 			 System.out.println(Z20.i);
 			 System.out.println("-----");
 			 System.out.println(Z20.i);  
 			 System.out.println("-----");
 			 System.out.println("main end");
 		 }
			
		}
