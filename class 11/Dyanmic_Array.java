import java.io.*;
import java.util.Scanner;

class Dyanmic_Array{
	public static void main(String[] args){
		Val_Arr va = new Val_Arr();
		//create an obj of the class
		
		//time to add elements just like in the arrayLists
		va.addElements(1);
		va.addElements(2);
		va.addElements(3);
		va.addElements(4);
		va.addElements(5);
		va.addElements(6);
		va.addElements(7);
		va.addElements(8);
		va.addElements(9);
		va.addElements(10);
		va.addElements(11);
		va.addElements(12);
		va.addElements(13);
		va.addElements(14);
		va.addElements(15);
		//used to display the elements 
		va.display();
		
	}
	
}
class Val_Arr{
	static int defaultVal = 10;
	//static so that the value has initial 10
	static int i = 0;
	//same here for temp puproses
	int Start_arr[] = new int[defaultVal];
	//create a new array for 10 size
	void addElements(int value){
		//addElements method to add the values
			
		if(i>=defaultVal){
			//the mechanism to create a new arrayf of 1.5* length
				defaultVal = (int)Start_arr.length*2;
				int temp_arr1[] = new int[defaultVal];
				temp_arr1 = Start_arr.clone();
				//clones the no of elements and the size
				Start_arr = new int[defaultVal];
				//the old array now the size changed
				
				//loop used to display the elements
				for(int a=0;a<temp_arr1.length;a++){
					Start_arr[a] = temp_arr1[a];
				
				}//end of loop
				temp_arr1 = null;
				//null here as the work was done by temp arr now setting it null
				Start_arr[i] = value;
				//copies the values in the array
				i++;
				//increments i 
		}
		
				
		else{
			Start_arr[i] = value;
			//copies the values in the array
			i++;
		}
		
		
	
}
//display method to display the new array elements
void display(){
	for( int k=0;k<i;k++){			
		 System.out.println(Start_arr[k]);	
		}
	
}
}