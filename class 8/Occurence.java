import java.util.Scanner;

class Occurence{
	public static void main(String[] args){
		Scanner da = new Scanner(System.in);
		System.out.println("Enter 1st string ");
		String Sa = da.nextLine();
		//take two Strings from the usr
		System.out.println("Enter 2nd string to check in first string ");
		String Sa1 = da.nextLine();	
		
		//boolean bs var that uses .contains method to verify the contents
		
			boolean bs = Sa.contains(Sa1);
			if(bs){
				//condn that works if is true
				System.out.println("Yes the String2 is present in String1");
			}
			else
				System.out.println("No the String2 is present in String1");
		/*
		tried this one but didnt worked
		
		char[] array1 = Sa.toCharArray();
		char[] array2 = Sa1.toCharArray();
int flag=0;
			for(int i=0;i<array1.length-1;i++){
				 //flag=0;
				for(int j=0;j<array2.length-1;j++){
					if(array1[i] == array2[j]){
						flag++;}
						else
							flag=0;
				}
			}
			if(flag==array2.length)
				System.out.println("yes the string is present");
				else
					System.out.println("no the string is not present");
			
			*/	
	}
	
}