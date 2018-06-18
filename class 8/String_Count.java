import java.util.Scanner;

class String_Count{
	public static void main(String[] args){
		Scanner accept = new Scanner(System.in);
		System.out.println("Enter string ");
		//taking i/p as the string
		String Sw = accept.nextLine();
		
				//flag var initalized to one
				int flag=1;
				
				for(int q =0;q<Sw.length()-1;q++){
					//for loop that parses through the whole string
					if((Sw.charAt(q)==' ')){flag++;}
					//here charAt is a methods that returns the char at the index given through q
					//the condn compares the char to the ' ' and the flag gets incr accordingly
				}//end of loop
			
				System.out.println("words in the string : "+flag);
				//gives out the no of words
				/*here the words mean
				
				for ex:- my name is hello
				in the statement there are 4 words and my condn in the loop compares the space to the 
				char as every word is after a space*/

		
	
}
}