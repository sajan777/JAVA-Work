class Rectangle{
	//Rectangle class with two private var length and breadth
			float length;
			float breadth;
	//private member fxn that access the private len and breadth 
	void get_values(float x,float y){
		length = x;
		breadth = y;
	}
	//public member fxn that access the private values 
	public float calculate_Area(){
		float areaa = length*breadth;
		return areaa;
		//calcualtes the area and returns it
	}
	
}
class Area{
	
	public static void main(String[] args){
		
		Rectangle rect = new Rectangle();
		//creating an obj rect 
		rect.get_values(5.5,8.6);
		//passing down values in the get_values fxn
		System.out.println("AREA of rec: " + rect.calculate_Area());
		//printing the final result and calling calculate_Area
	}
	
}