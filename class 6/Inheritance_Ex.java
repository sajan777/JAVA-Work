
class Inheritance_Ex{
	public static void main(String[] args){
	Cat c = new Cat();
//here the method speak would get overriden for the cat class	
		c.speak();
		//calls the method of the cat class
	}
}

class Animal{
String color;
String breed;
void speak(){
	//In the Animal Class as a base class
	System.out.println("Animal Kingdom");
}	
}
class Dog extends Animal{
String Dog_Color="brown";
String Dog_Breed="Labradour";
void speak(){
	//Dog class inherited over animal
	System.out.println("Dog : bhaowww");
	System.out.println("Dog Color: brown"+Dog_Color);
	System.out.println("Dog Breed :"+Dog_Breed);
}
	
	
}
class Cat extends Animal{
	String Cat_Color="white";
	String Cat_Breed="american";
	void speak(){
		//Cat Class inherited over Animal
		System.out.println("Cat: Meeeaaaowwww");
		System.out.println("CAt Color: brown"+Cat_Color);
		System.out.println("CAt Breed :"+Cat_Breed);
}
	}	

