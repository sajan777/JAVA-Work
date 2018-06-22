zimport java.util.*;
class Array_ListDemo{
public static void main(String[] args){
	Employee eobj1= new Employee("Piyush",132,"Junior Engg",13.7f);
	Employee eobj2 = new Employee("Sajan",162,"Junior Engg",14.7f);
	Employee eobj3 = new Employee("Rashim",153,"Junior Engg",15.7f);
	Employee eobj4 = new Employee("Rahul",192,"Junior Engg",16.7f);
	
	
	ArrayList<Employee> aLe = new ArrayList<Employee>();
	aLe.add(eobj1);
	aLe.add(eobj2);
	aLe.add(eobj3);
	aLe.add(eobj4);
 	
	Iterator itr1 = aLe.iterator();
		while(itr1.hasNext()){
    Employee et=(Employee)itr1.next();  
    System.out.println(et.name+" "+et.e_id+" "+et.Designation+" "+et.Workspace);
		}
	
	/*
	ArrayList<String> aL = new ArrayList<String>();
		aL.add("Piyush");
		aL.add("Satyam");
		aL.add("Rahul");
		aL.add("Rashim");
		aL.add("Vinay");
		
		Iterator itr = aL.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		itr.
		*/
}
}
class Employee{
	String name;
	int e_id;
	String Designation;
	float Workspace;
	
	Employee(String name,int e_id,String Designation,float Workspace){
		this.name = name;
		this.e_id = e_id;
		this.Designation = Designation;
		this.Workspace = Workspace;
	}
	
	
}