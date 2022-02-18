public class Array {
	
	public static void main(String[] args) {
			
			int number=10;
			//int[] numbers = new int[5];
			int[] numbers={10,20,25,30,35,40,50};

			System.out.println(numbers[0]);  //default value in array is 0

			//default value for string in array is null and boolean is false

			numbers[0]=15;



			System.out.println(numbers[0]);

			for(int i=0;i<numbers.length;i++){


				System.out.println(numbers[i]);
			}


		}
}



