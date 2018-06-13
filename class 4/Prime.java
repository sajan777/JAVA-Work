import java.util.Scanner;
//import the Scanner File for System.in

class Prime{
	
	public static void main(String[] args){
		Scanner value2 = new Scanner(System.in);
		//refrencing value for the Scanner System.in
		System.out.println("Enter any no to print Prime no till there : ");
		//Enter any no
		int prm = value2.nextInt();
		//get an int value
	//for loop that goes until the prm value
	for(int i=2;i<=prm;i++){
		int flag =0;
		//falg var that is initalized to zero
		
		for(int j=2;j<i;j++){
			
			if(i%j==0){
				//conditional statement if it matches the flag var gets equal to 1
				flag =1;
				break;
				//as soon as the we found the match break statement breaks from the loop 
			}
		}
		//the flag var would only be zero if the condition didnt satisfy
		if(flag==0){System.out.println("Prime no: "+ i);}
		
	}

		
		
	
												}
}