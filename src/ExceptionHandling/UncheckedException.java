package ExceptionHandling;

public class UncheckedException {
	public static void main(String[] args) {
		
		System.out.println("Program started");
		
		
//		int a = 10/0;      Risky code we will write it into catch try block and providing alternative in catch block
		
		
		int a = 1000;
		try {
			System.out.println(a/0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(a/10);
			System.out.println("handled");
			
		}
			
		int b [] = {1,2,5,4};
		try {
		for(int c=0; c<=4; c++) {
			System.out.println(b[c]);
		}}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
