package day3;

	public class factorial {
			public static void main(String[] args) {
				int a = 9; int fact = 1; int i;
				
				for(i=1; i<=a; i++) {
					fact= fact*i;
					
				}
			System.out.println("Factorial of " +a +" is "+fact);
		
			}
}