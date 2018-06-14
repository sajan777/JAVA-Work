class Array_Waveform{
	public static void main(String[] args){
	//array with elements
		int arry[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Original message: ");
		for(int i=0;i<arry.length;i++){
			System.out.println(arry[i]);
		}//print out the original contents in the array
	
	//outer loop for the iteration till the end
	for(int i=0;i<arry.length;i=i+2){
		//statement i=i+2 moves to the one after element
		for(int j=i+1;j<arry.length;j=j+2){
			//inner loop for replacing the elements
			if(arry[i]<arry[j]){
				int random = arry[i];
				arry[i] = arry[j];
				arry[j] = random;
				//here the interchange is happening
					break;//break statement to break out of the inner loop 				
			}//end of if statement
		}//end of inner loop
	}//end of outer loop
	System.out.println("Final Output: ");
	for(int i=0;i<arry.length;i++){
		System.out.println( "Array "+arry[i]);
	}
	//loop to print out the contents in the array.after replacing
}
}