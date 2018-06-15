
class New_Class{
	static{
		System.out.println("Well Hi from Static block");
	}//this is a Static block declared 
	New_Class(){
		System.out.println("Well Hi from Constructor");
	}
	//constructor of the class
	void rand_Method(){
		System.out.println("Well Hi from a Method");
	}//method from the New_Class
	
}

class Static_Blocks{
	public static void main(String[] args){
		System.out.println("Well Hi from main method");
		New_Class Nc = new New_Class();
		//creating an obj of the New_Class
		Nc.rand_Method();
		//calling the fxn 
		//New_Class.rand_Method();
	
		
	}
	
}