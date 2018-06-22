import java.io.*;
import java.util.*;

class HashMap_Demo{
	public static void main(String[] args){
		HashMap<String,Double> hash = new HashMap<String,Double>();
		//cretes a hashmap with arguments String and Double type
		
		hash.put("Piyush",new Double(65));
		hash.put("Satyam",new Double(62));
		hash.put("Vinay",new Double(32));
		hash.put("Rashim",new Double(42));
		hash.put("Rahul",new Double(77));
		hash.put("Mandeep",new Double(97));
		//hash.put is a method that adds value to the hashmap
		//in the form of key object and value object
		
		Set set = hash.entrySet();
		//here set is created the methods hash.entrySet takes  all the keys and values  in the set.
		Iterator itr = set.iterator();
		//used an iterator that traverse through the set
		while(itr.hasNext()){
			Map.Entry map = (Map.Entry)itr.next();
				//here the final value is converted into map.Entry type that has values and keys
			System.out.print(map.getKey() + ":- ");
			//map.getKey() gives the key
			System.out.println(map.getValue() + "");
			//map.getKey() gives the Value
		}	
	}
}