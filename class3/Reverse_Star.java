class Reverse_Star{
	public static void main(String[] args){
		//1st loop fo the printing of the spaces after the *
		for(int i=1;i<=4;i++){
			//2nd loop decrements as the * get printed
			for(int j=4;j>=i;j--){
				//print used for the printing of stars in continuation
				System.out.print("*");
			}
			//for the space \n
			System.out.println("\n");
		}
	
}
}