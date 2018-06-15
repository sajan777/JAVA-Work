class Overload_Print{
	public static void main(String[] args){
		//create an obj of the class.
		Ran ran = new Ran();
		//here we've displayed overloading here the compiler matches the arguments and calls the proper fxn
		ran.print_Data();//null
		ran.print_Data(9);//int
		ran.print_Data(7.5f);//float
		ran.print_Data(4,5.6f);//int,float
	}
	
}
class Ran{
	//different methods accepting diff arguments
	
void print_Data(){
	System.out.println("In the Function that takes null arguments ");
}
void print_Data(int x){
	System.out.println("NO: "+ x +" Hi i take an integer type argument");
}

void print_Data(float z){
	System.out.println("NO: "+ z +" Hi i take an float type argument");
}

void print_Data(int a,float b){
	System.out.println("NO1: "+a +" Hi i take an int type argument " +"NO2: "+ b + " and a float type");
}
}