import java.util.Scanner;
public class DoWhile {
	
	public static void main(String[] args) {
			
			//Single line comment

			int number=0; 

			Scanner value = new Scanner(System.in);

			/*
				Multi line comment in java

				Multi line comment in java
			
			*/


			do{

					System.out.println("Enter a number: ");
					number= value.nextInt();


			}
			while(number !=9);
			System.out.println("you got 9");
		}
}


