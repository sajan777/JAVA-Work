import java.util.Scanner;

class Occurence{
	public static void main(String[] args){
		Scanner da = new Scanner(System.in);
		System.out.println("Enter 1st string ");
		String Sa = da.nextLine();
		System.out.println("Enter 2nd string to check in first string ");
		String Sa1 = da.nextLine();	
		
		char[] array1 = Sa.toCharArray();
		char[] array2 = Sa1.toCharArray();
int flag=0;
			for(int i=0;i<array1.length;i++){
				 //flag=0;
				for(int j=0;j<array2.length;j++){
					if(array1[i] == array2[j]){
						flag++;}
						else
							flag=0;
				}
			}
			if(flag==array2.length){
				System.out.println("yes the string is present");
			}
			
	}
	
}