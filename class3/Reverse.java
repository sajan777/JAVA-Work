class Reverse{
	
	public static void main(String[] args){
		//initalizing a random value to a no
		int no = 1234;
		//Print the original value
		System.out.println("Original no: "+no);
		//store the remainder to the variable
		int a = no%10;
		//change the original value to the no
		no = no/10;
		//store the remainder to the variable
		int b = no%10;
		//change the original value to the no
		no = no/10;
		//store the remainder to the variable
		int c = no%10;
		//change the original value to the no
		no = no/10;
		//get the last remainder in the variable
		int d= no;
		//lastly print the contents
		System.out.println("Reverse no: "+ a + b + c + d);
		
	}
	
	
}