class Generic_Print{
	
	public static void main(String[] args){
		
		Print_Demo pd = new Print_Demo();
		//object created for the print_demo
		
		//creating arrays for int,float,double,char types
		Integer[] int_Array = {1,2,4,5,6,7};
		Double[] double_Array = {1.5, 2.5, 4.5, 5.5, 6.5, 7.5};
		Character[] char_Array = {'a','b','c','d','e','f'};
		Float[] float_Array = {1.2f, 2.4f, 4.6f, 5.8f, 6.9f, 7.1f};
		
		//calling the overloaded printVal fxn 
		
		System.out.println("Hi i am from integer :");
		pd.PrintVal(int_Array);
		System.out.println("Hi i am from char :");
		pd.PrintVal(char_Array);
		System.out.println("Hi i am from double :");
		pd.PrintVal(double_Array);
		System.out.println("Hi i am from float :");
		pd.PrintVal(float_Array);
	}
}
class Print_Demo{
	//creating a generic Print val fxn
	public <T> void PrintVal(T[] arr){
		//T[] arr is the template type array
		for(T input : arr){
			System.out.println(input);
			//for each loop to print the values
		}
		System.out.println(" ");
		//to give spaces
	}
}