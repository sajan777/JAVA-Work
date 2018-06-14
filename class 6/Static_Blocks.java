class New_Class{
	static{
		System.out.println("Well Hi from Static block");
	}
	New_Class(){
		System.out.println("Well Hi from Constructor");
	}
	void rand_Method(){
		System.out.println("Well Hi from a Method");
	}
	
}

class Static_Blocks{
	public static void main(String[] args){
		System.out.println("Well Hi from main method");
		New_Class Nc = new New_Class();
	
		
	}
	
}