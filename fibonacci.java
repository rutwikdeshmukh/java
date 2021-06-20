package day3;

public class fibonacci {

	public static void main(String[] args) {
		int a = 10; int b = 0, c = 1; int counter = 0;
  
		while (counter < a) {
  
            System.out.print(b + " ");
  
            int d = c + b;
            b = c;
            c = d;
            counter = counter + 1;
        }
		
	}

}
