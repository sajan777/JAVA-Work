import java.util.Scanner;

class String_Reverse{
	public static void main(String[] args){
		Scanner data = new Scanner(System.in);
		System.out.println("Enter any string to reverse it: ");
		String Sa = data.nextLine();
		//taking the i/p
		
		//reverse mechanism..
	
		char[] array = Sa.toCharArray();
		//convert the string in to char array
		for(int i=0;i<array.length;i++){
			//prints out the data in string
			System.out.print(array[i]);
		}//end of loop 
		//another loop that prints the value after reverse
		System.out.println(" 2After Reversal");
		for(int i=array.length-1;i>0;i--){
			//printthe data
			System.out.print(array[i]);

		}//end of loop
	}
	
}