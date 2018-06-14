import java.util.Scanner;

class Array_Creation{
	public static void main(String[] args){
		Scanner get = new Scanner(System.in);
		//int n = get.nextInt();
		int arr[] = new int[5];
		//System.out.println("Enter the elements in the array: ");
		int i;
		for( i=0;i<5;i++){
			arr[i]= get.nextInt();			
			
		}
		if( i==5){
				int z =arr.length*2;
				int arr1[] = new int[z];
				arr1 = arr.clone();
			
		}
		
	}
	
	
}