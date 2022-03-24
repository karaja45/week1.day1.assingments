package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		int i;
		int fact=1;
		for ( i=5; i > 0; i--) {
			fact=i*fact;
			System.out.println("i"+i);
		}
		System.out.println("fact"+fact);
		System.out.println("fact"+fact); 
		

	}

}
