public class IfStatement {
	
	public static void main(String[] args) {


		int amount=20;

		if(amount ==10){


				System.out.println("It's True");
				
			}
		else if(amount >30){

				System.out.println("It's False");


		}
		else{
				System.out.println("None of the above");

		}


		amount=0;

		while(true){

			System.out.println("In the loop");

			if(amount==6){
				break;
			}
			amount++;
			
		}
}

}


