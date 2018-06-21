import java.io.*;
import java.util.Scanner;

class Dyanmic_Array{
	public static void main(String[] args){
		Val_Arr va = new Val_Arr();
		
		va.addElements(6);
		va.addElements(1);
		va.addElements(2);
		va.addElements(3);
		va.addElements(4);
		va.addElements(5);
		va.addElements(7);
		va.addElements(8);
		va.addElements(9);
		va.addElements(10);
		va.addElements(11);
		va.addElements(12);
		va.display();
		
	}
	
}
class Val_Arr{
	static int defaultVal = 10;
	static int i = 0;
	int Start_arr[] = new int[defaultVal];
	void addElements(int value){
		
		//Scanner get_Val = new Scanner(System.in);
		//int n = get_Val.nextInt();	
		
		
		if(i>=defaultVal){
				defaultVal = (int)Start_arr.length*2;
				int temp_arr1[] = new int[defaultVal];
				temp_arr1 = Start_arr.clone();
				Start_arr = new int[defaultVal];
				
				for(int a=0;a<temp_arr1.length;a++){
					Start_arr[a] = temp_arr1[a];
				
				}
				temp_arr1 = null;
				Start_arr[i] = value;
				i++;
	
		}
		
				
		else{
			Start_arr[i] = value;
			i++;
		}
		
		
	
}

void display(){
	for( int k=0;k<i;k++){			
		 System.out.println(Start_arr[k]);	
		}
	
}
}