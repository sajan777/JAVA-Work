import java.util.Scanner;
//import the Scanner File for System.in

class Amstrong{
	
	public static void main(String[] args){
		int sum=0;
		//sum var inital at 0
		
		Scanner value3 = new Scanner(System.in);
		//refrencing value for the Scanner System.in
		System.out.println("Enter any no to check whether its amstrong or not3 : ");
		//Enter any no
		int am = value3.nextInt();
		//get an int value
		
		int number = am;
		//here the contents in the am var gets copied to the number var
		for(int i=number;i!=0;i=i/10){
		//ex: i=153 the condn would run until gets equal to zero the statement i=i/10 gives the dividend	
			int q = i%10;
			//here we get the remainder of the org value
			 sum = sum+(q*q*q);
			 //here the sum var has the cube for different values
		}
		//conditional statement that compares the i/p value to the calculated value
		if(sum==am){
			System.out.println(am + "is an Amstrong");
		}
		else
			System.out.println(am + "is not an Amstrong");
		
	
}
}