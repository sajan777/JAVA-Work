class Abstract_Ex{
	public static void main(String[] args){
		//creating an object for dog class and cant create the
		//obj for the animal class due to its abstract nature
		Dog dog = new Dog();
		//calling the methods
		dog.speak();
		dog.eat();
	}
}
abstract class Animal{
	
	abstract public void speak();
	//abstract method only defined not methods inside its due to its abstract nature
	pub8lic void eat(){
		//eat method is defined 
		System.out.println("Dog Eat: "+"Dog Food");
	}
	
}
class Dog extends Animal{
	//speak method for dog further the eat method would be inherited.
	public void speak(){
	System.out.println("Dog Speak: "+" bhaaowww");
}
}
