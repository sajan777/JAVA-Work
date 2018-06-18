class Sub_String{
	
	public static void main(String[] args){
		
		String sa =new String("ABC");
		//taking the i/p in the string
		
		//...Although this method is only valid for 3 char in the String as instructed in the question (Assignment)
		
		//here we can see multiple print statements that shows different 
		//Substrings using the substring fxn
		
		System.out.println(sa.substring(0,1));
		System.out.println(sa.substring(1,2));
		System.out.println(sa.substring(2));
		System.out.println(sa.substring(0,2));
		System.out.println(sa.substring(1));
		System.out.print(sa.substring(0,1));
		System.out.println(sa.substring(2));
		System.out.println(sa);
		
	}
	/*o/p should be
	A
	B
	C
	AB
	BC
	AC
	ABC*/
	
}