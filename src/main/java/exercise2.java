public class exercise2 {
	public static void main(String[] args){
	
		if(args.length!=2){
			System.out.println("Too few or too many arguments.");
			System.exit(1);
		}
		else{
			if(!args[0].equals("lazy")&&!args[0].equals("triangle")){
				System.out.println("Incorrect first argument. Try lazy or triangle.");
				System.exit(1);
			}
			else{
				try{
					int num = Integer.parseInt(args[1]);
					if(args[0].equals("lazy")){
						System.out.println("Lazy("+num+") = "+lazy(num));
					}
					else{
						System.out.println("Tri("+num+") = "+tri(num));
					}
				} catch (NumberFormatException ex) {
					System.out.println("Enter an integer buddy");
					System.exit(2);
				}
			}
		}
	}
	
	public static int lazy(int number){
		int cuts=number*number+number+2;
		cuts=cuts/2;
		return cuts;
	}
	
	public static int tri(int number){
		int sum=0;
		sum = number*(number+1)/2;
		return sum;
	}
	
}

			
	/*		package laboon;
			public class Fibonacci {
			 public static long fibonacci(long num) {
			 if (num <= 1) {
			 return num;
			 } else {
			 return fibonacci(num - 1) + fibonacci(num - 2);
			 }
			}

			public static void main(String[] args) {
			 if (args.length == 0) {
			 System.out.println("Enter something buddy");
			 System.exit(1);
			 } else {
			 try {
			 long x = fibonacci(Long.parseLong(args[0]));
			 System.out.println("Fibonacci is: " + x);
			 } catch (NumberFormatException ex) {
			 System.out.println("Enter an integer buddy");
			 System.exit(1);
			 }
			 }
			 }
			}*/
