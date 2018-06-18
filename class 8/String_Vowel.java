import java.util.Scanner;

class String_Vowel{
	public static void main(String[] args){
		Scanner data1 = new Scanner(System.in);
		System.out.println("Enter any string to remove the vowel from it : ");		
		String input = data1.nextLine();
		//take i/p in the form of String
		
			StringBuffer str=new StringBuffer() ;
//create a new StringBuffer str
			
			//the mechanism to remove vowels
		for(int i=0;i<input.length();i++){
			if(input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o' && input.charAt(i) != 'u'){
				str.append(input.charAt(i));
				
			}
		}//end of loop
		
			System.out.println(str);
	
	}
}