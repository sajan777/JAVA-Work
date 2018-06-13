
class Ascending_Array{
	
	public static void main(String[] args){
		 int List_of_num[] = {1,1,1,1,0,0,1,0};
		 //here we have the array as list of no
		 System.out.println("Original Value " + List_of_num);
		//print out the org value in the array	
			for(int i=0;i<List_of_num.length;i++){
				//okay this is the outer loop that loops through the end of the array
				for(int j=i+1;j<List_of_num.length;j
				//okay this one is for comparing the array values as i and j get incremented
					
					if(List_of_num[i]>List_of_num[j]){
						//okay here we have the conditional statement that compares the value
						int replace;
						//a replace var used for storing the value for temporary purposes
						replace = List_of_num[i];
						List_of_num[i] = List_of_num[j];
						List_of_num[j] = replace;
						//the replace is happening in these 3 statements
						
					}//end of the inner loop
				}
				//end of the outer loop
				
				
			}//another loop to print out the contents in the array after replacement.
			System.out.println("After Parsing the array: ");
			for(int i =0;i<List_of_num.length;i++){
				System.out.println(List_of_num[i]);
			}
		
		
	
}
}
