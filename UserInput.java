import java.util.Scanner;
public class UserInput {
	
	public static void main(String[] args) {
			
			Scanner input= new Scanner(System.in);

			System.out.println("Enter a text line");

			String text = input.nextLine();

			System.out.println("Your line is : "+ text);

			System.out.println("Enter A value");
			int aValue = input.nextInt();

			System.out.println("Enter B value");
			double bValue= input.nextDouble();

			double sum= aValue + bValue;

			System.out.printf("Sum is %.2f ",sum);






		}
}


