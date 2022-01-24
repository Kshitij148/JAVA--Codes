import java.util.Scanner;
public class Sum {
	
	public static void main(String[] args) {
			
			
			Scanner input  = new Scanner(System.in);

			System.out.println("Enter variable a: ");
			int a = input.nextInt();

			System.out.println("Enter variable b: ");
			int b = input.nextInt();

			int sum=a+b;

			System.out.printf("The Sum is: "+sum);

		}
}


