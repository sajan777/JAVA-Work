import java.util.Scanner;

class Array_Secondlarg{
	
	public static void main(String[] args){
		
		System.out.println("Enter the length of the array: ");
		Scanner val = new Scanner(System.in);
		int n = val.nextInt();
		//ask the user how many array elements in new
		
		int arr[] = new int[n];
		//declared an array of n data elements
		System.out.println("Enter all the elements in the array: ");
		//okay this loop is for getting the user i/p in the array
		for(int i =0;i<n;i++){
			arr[i] = val.nextInt();
		}
	//aligining the array elements in the descending order..
		for(int i=0;i<n;i++){
			//outer loop that parses through the array till new
			for(int j=i+1;j<n;j++){
				//inner loop for the comparison purposes
				if(arr[i]<arr[j]){
					//okay this condn compares and aligns the array element in the descending form
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					//temp var that replaces the value 
  					
				}//end of condition
			}//end of inner loop
			
		}//end of outer loop
		
		System.out.print("After Parsing the array Second largest element: ");
			
				System.out.println(arr[1]);
			//print out the second element in the descending array.
		
	}
	
}