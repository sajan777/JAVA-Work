import java.util.Scanner;
//import the Scanner File for System.in

class Array_Check{
	
	public static void main(String[] args){
		 int List_of_num[] = {1,4,6,7,8,9,10};
		 //create a array with numbers
		int flag = 0;
		//flag variable
		Scanner value4 = new Scanner(System.in);
		//refrencing value for the Scanner System.in
		System.out.println("Enter a no to check if its already in the array: ");
		//Enter any no
		int arr_Check = value4.nextInt();
		//get an int value
		
		//Here we have a foreach loop that loops through the list of numbers
		for(int number:List_of_num){
			if(number == arr_Check){
				//here is a condn that compares the number and the arr_check the i/p no 
				System.out.println(arr_Check +" Hey i found your no ");
				flag =1;
				//the flag var gets equal to 1 just as soon the no gets found
			}
		}//the flag var would only be 0 if the codn didnt met.
		if(flag==0){
			System.out.println("OOPs ! Sorry no is not there!!!");
		}
		
	
}
}
