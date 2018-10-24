package pattern;

 class Z22 
	{
	static int i;
 	static
 	{
 		int i=10;
 		System.out.println("Z22.SIb:" +i); 
 		System.out.println("Z22.SIb:" +Z22.i);
 		i=20;
 		Z22.i=200;
 	}

	}
  class Z21
		 {
		 static
		 {
			 System.out.println("Z21.SIb");
			 
		 }
		 public static void main(String[] args) 
		 {
			 System.out.println("main begin");
			 System.out.println(Z22.i);
			 Z22.i=300;
			 System.out.println("-----");
			 System.out.println(Z22.i);
			 Z22.i+=300;
			 System.out.println("-----");
			 System.out.println(Z22.i);  
			 System.out.println("main end");
		 }
		
	}



