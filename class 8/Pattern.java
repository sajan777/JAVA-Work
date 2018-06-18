class Pattern{
	public static void main(String[] args){
	//outer loop for the incremental part of the A AB ABC
	for(int i=65;i<68;i++){
		
		//here the loop starts from 65 as the ascii for A is 65 and ends at C which is 68
		for(int j=65;j<=i;j++){
			
			//inner loop for the first print 
			System.out.print((char)j);
			//here we convert the int value back to the char
		
		}//end of inner loop
		
		System.out.println(" ");
		//another sop coz as the inner loop terminates the values are printed in the line without spacing
	
	}//end of outer loop
	
	}	
	/**pattern to print
	A
	AB
	ABC
	**/
	
}