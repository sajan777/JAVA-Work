import java.io.*;
import java.util.*;

class Generic_Sort{
	
	public static void main(String[] args){
		
		Sort_Demo sd = new Sort_Demo();
		
	//creating arrays for int,float,double,char types
		Integer[] int_Array = {6,8,9,2,4,1};
		Double[] double_Array = {4.5,7.8,5.6,9.9,4.2};
		Character[] char_Array = {'v','t','u','s','q','r'};
		Float[] float_Array = {3.1f, 5.7f, 4.6f, 5.8f, 1.2f, 7.1f};
		String[] String_Array = {"Sajan","Vinay","Rashim","Piyush","Satyam","rahul"};
		
		//calling the overloaded Sort fxn 
		
		System.out.println("Hi i am from integer :");
		sd.SortVal(int_Array);
		System.out.println("Hi i am from char :");
		sd.SortVal(char_Array);
		System.out.println("Hi i am from double :");
		sd.SortVal(double_Array);
		System.out.println("Hi i am from float :");
		sd.SortVal(float_Array);
		System.out.println("Hi i am from String :");
		sd.SortVal(String_Array);
	}
	
	}
class Sort_Demo{
	//creating a generic Print val fxn
	public <T> void SortVal(T[] arr){
		//T[] arr is the template type array
		Arrays.sort(arr);
		//Sorting method sorts the data in the array
		for(T input : arr){
			System.out.println(input);
			//for each loop to print the values
		}
		System.out.println("");
		//to give spaces
	}
}
	
	
	
	
	/* tried this but didnt worked
	
	
			Sort_Demo sd = new Sort_Demo();
		Integer[] arr = {8,3,1,5,6,9};
		sd.sortData(arr);
		System.out.println("aekfbciwecbqewbv");
		sd.sortData(arr);
		

class Sort_Demo<T> implements Comparable{
		
	public <T> void sortData(T[] arry){
		
		for(int q=0;q<arry.length-1;q++){
					T smallest = q;	
			for(int j=q+1;j<arry.length;j++){
				if((arry[j].compareTo(arry[smallest]))<0){ 
					 smallest = arry[j];
  					}
					else{
						 smallest = arry[smallest];
					}
			}
			replace(arry,q,smallest);
		}
	}
		
		public <T> void replace(T[] ar,int a,int b){
			if((a != b) || (b<a)){
				    T temp = ar[a];
					ar[a] = ar[b];
					ar[b] = temp;
		}
		}
		
	
	}
	*/
	
	
