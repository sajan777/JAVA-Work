import java.io.*;
import java.util.*;
class SetClass_Demo{
	
	public static void main(String[] args){
		HashSet<String> hs1 = new HashSet<String>();
		//cretes a new hashstring hs1 with <String> types
		hs1.add("Piyush");
		hs1.add("Satyam");
		hs1.add("Avnish");
		hs1.add("Rahul");
		//adds the value into the hs1  set Created
		
		System.out.println("Hash 1 elements before retaining: " + hs1);
		
		HashSet<String> hs2 = new HashSet<String>();
		//cretes a 2nd new hashstring hs2 with <String> types
		
		hs2.add("Piyush");
		hs2.add("Ram");
		hs2.add("Honey");
		hs2.add("Rahul");
		//adds the value into the hs2  set Created
		System.out.println("Hash 2 elements before retaining: " + hs2);
		
		hs1.retainAll(hs2);
		//retainAll method takes only the similar values
		
		HashSet<String> hs3 = new HashSet<String>();
		//cretes a new hashstring hs3 with <String> types to store the data after retaining
		
		hs3 = hs1;
		//copies the data from hs1
		
		System.out.println("Hash 3 elements after retaining: "+ hs3);
		
		
	}
	
	
}