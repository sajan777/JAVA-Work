class Complex_Demo{

	public static void main(String[] args){
		
	Complex c1 = new Complex();
	//complex class object
		c1.get_Data(5,7);
		//passing the values in the getdata
		c1.display_Data();
		//display the contents

	}

}
class Complex{
	//class complex with private var real and imag 
private int real;
private int imag;
	//get_Data that takes the value in the x and y part.
	   void get_Data(int x,int y){
		 real = x;
		 imag =y;
		}
	//display fxn that displays the content 
		public void display_Data(){
			System.out.println("Value: "+ real +"+i"+ imag);
		}
	
}