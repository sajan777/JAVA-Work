import java.util.Scanner;
//import the Scanner File for System.in

class Even{
	
	public static void main(String[] args){
		Scanner value = new Scanner(System.in);
		//refrencing value for the Scanner System.in
		System.out.println("Enter any no to print Even no till there : ");
		//Enter any no
		int ev = value.nextInt();
		//get an int value
		
		for(int i=1;i<=ev;i++){
			//loop to check the Even no till the no given
			if(i%2 == 0){
				System.out.println("Even: "+i);
			}//end of loop	
	}
	
}
}