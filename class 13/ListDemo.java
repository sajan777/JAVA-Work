import java.io.*;
import java.util.*;

class ListDemo{
	public static void main(String[] args){
		ArrayList<Employee> EL=new ArrayList<Employee>();
		//create a  new array list that will hold the values 
		//array list of Employee type
		
			EL.add(new Employee(6316051,"Piyush"));  
			EL.add(new Employee(6316071,"Satyam"));  
			EL.add(new Employee(6316068,"Sajan"));  
			EL.add(new Employee(6316011,"Rahul"));
		//adds new values	
			
			System.out.println("Sorting by Name...");  
		
		//using the collections.sort method to compare the values
			Collections.sort(EL,new Employee_Name_Compare());  
			for(Employee ename: EL){  
			System.out.println(ename.e_id+" "+ename.Employee_Name);  
			} //for each loop to display the values 
			  
			System.out.println("sorting by ID...");  
			  
			Collections.sort(EL,new IdCompare());
//using the collections.sort method to compare the values on id			
			for(Employee eid: EL){  
			System.out.println(eid.e_id+" "+eid.Employee_Name);  
			}//for each loop to display the new sorted values   
	}
}
class Employee{
//create a new class Employee having e_id and Employee_Name.	
int e_id;
String Employee_Name;
//Employee class constructor 
Employee(int e_id,String Employee_Name){
	
	//passes the value this fxn points to the refrence
	this.e_id = e_id;
	this.Employee_Name = Employee_Name;
	
}//end of constructor
}//end of Employee class

class IdCompare implements Comparator<Employee>{
	//used a IDCompare class that implements comparator of<Employee> type
	
	//compare method inside the Comparator interface being overriden
	public int compare(Employee E1, Employee E2){
		//method of arguments as ohject type E1 and E2
		
		//comparison mechanism
		if(E1.e_id==E2.e_id){  
		return 0; } 
	else if(E1.e_id>E2.e_id){  
		return 1;  }
		else { 
	return -1;}
				}
}//end of class IDCompare
class Employee_Name_Compare implements Comparator<Employee>{ 
//another class that compares on the basis of name

//compare method int he comparator interface being overriden 
public int compare(Employee E1,Employee E2){  
return E1.Employee_Name.compareTo(E2.Employee_Name); 
//compares the value and returns it 
}
} 