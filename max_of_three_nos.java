package day3;

public class max_of_three_nos {

	public static void main(String[] args) {
	
		 int num1 = 60;
	     int num2 = 55;
	     int num3 = 5;
	     if (num1 >= num2 && num1 >= num3)
	    	 System.out.println( num1 + " is the maximum number.");
	      else if (num2 >= num1 && num2 >= num3)
	         System.out.println( num2 + " is the maximum number.");
	      else
	         System.out.println( num3 + " is the maximum number.");
		
	}

}
