
class Inheritance_Ex{
	public static void main(String[] args){
	Cat c = new Cat();	
		c.speak();
	}
	
	
}

class Animal{
String color;
String breed;
void speak(){
	
	System.out.println("Animal Kingdom");
}	
}
class Dog extends Animal{
String Dog_Color;
String Dog_Breed;
void speak(){
	System.out.println("Dog : bhaowww");
}
	
	
}
class Cat extends Animal{
	String Cat_Color;
	String Cat_Breed;
	void speak(){
		
		System.out.println("Cat: Meeeaaaowwww");
	}	
}