import java.util.Scanner;
public class Greater {
	
	public static void main(String[] args) {
			
			
			Scanner input  = new Scanner(System.in);

			System.out.println("Enter variable a: ");
			int a = input.nextInt();

			System.out.println("Enter variable b: ");
			int b = input.nextInt();

			if(a>b){

				System.out.println("The greater number is "+a);
				System.out.println("The program ended");
			}
			else{

				System.out.println("The greater number is "+b);
				System.out.println("The program ended");

			}

			

		}
}


