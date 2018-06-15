class Interface_Ex{
	public static void main(String[] args){
		//creation of objects and calling the methods in the class
		System.out.println("Cat object created and Methods Called ");
		Cat ct= new Cat();
		ct.speak();
		ct.eat();
		System.out.println("Dog object created and Methods Called ");
		Dog dg= new Dog();
		dg.speak();
		dg.eat();
	}
}
interface Animal{
	public void speak();
	//two methods just only declared but not defined
	public void eat();
}
class Dog implements Animal{
	//speak and eat defined
	public void speak(){
		System.out.println("Dog Speak: "+" bhaaowww");
	}
	public void eat(){
		System.out.println("Dog Eat: "+" Dog Food");
	}
}
class Cat implements Animal{
//speak and eat defined
	public void speak(){
		System.out.println("Cat Speak: "+" Meaowww");
	}
	public void eat(){
		System.out.println("Cat eat: "+"Cat Food");
	}	
	
}