import java.util.Scanner;
class String_int{
	public static void main(String[] args){
		Scanner val_String = new Scanner(System.in);
		
		System.out.println("Enter 1st number: ");
		String s = val_String.nextLine();//nextLine takes the data in the form of String
		
		System.out.println("Enter 2nd number: ");
		String s1 = val_String.nextLine();
		
		//storing the result in the integer 
		int result1 =Integer.parseInt(s);
		//using Integer class and parseInt
		int result2 =Integer.parseInt(s1);
		if(result1>result2){
			//condition that checks for no
		System.out.println("Integer highest no : "+result1);
		//print out the result
		
	}
}
}