import java.util.Scanner;

class String_Vowel{
	public static void main(String[] args){
		/*Scanner data1 = new Scanner(System.in);
		System.out.println("Enter any string to reverse it: ");
		StringBuffer input_String = data1.nextLine();
		*/
		StringBuffer input = new StringBuffer("value");
				char[] array1 = input.toString().toCharArray();
				
			StringBuffer str=new StringBuffer("") ;

		for(int i=0;i<array1.length-1;i++){
			if((array1[i] == 'a' || array1[i] == 'e' || array1[i] == 'i' || array1[i] == 'o' || array1[i] == 'u')){
				str=str+input.deleteCharAt(i);
			}
		}
		
			System.out.println();
	
	}
}