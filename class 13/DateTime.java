import java.io.*;
import java.util.*;

class DateTime{
	public static void main(String[] args){
		
		HashMap<Integer,String> hash_Days = new HashMap<Integer,String>();
		//cretes a hashmap with arguments String and Double type having days from 1 to 31
					hash_Days.put(1,"one");
					hash_Days.put(2,"two");
					hash_Days.put(3,"three");
					hash_Days.put(4,"four");
					hash_Days.put(5,"five");
					hash_Days.put(6,"six");
					hash_Days.put(7,"seven");
					hash_Days.put(8,"eight");
					hash_Days.put(9,"nine");
					hash_Days.put(10,"ten");
					hash_Days.put(11,"eleven");
					hash_Days.put(12,"tweleve");
					hash_Days.put(13,"thirteen");
					hash_Days.put(14,"fourteen");
					hash_Days.put(15,"fifteen");
					hash_Days.put(16,"sixteen");
					hash_Days.put(17,"seventeen");
					hash_Days.put(18,"eighteen");
					hash_Days.put(19,"nineteen");
					hash_Days.put(20,"twenty");
					hash_Days.put(21,"twenty one");
					hash_Days.put(22,"twenty two");
					hash_Days.put(23,"twenty three");
					hash_Days.put(24,"twenty four");
					hash_Days.put(25,"twenty five");
					hash_Days.put(26,"twenty six");
					hash_Days.put(27,"twenty seven");
					hash_Days.put(28,"twenty eight");
					hash_Days.put(29,"twenty nine");
					hash_Days.put(30,"thirty");
					hash_Days.put(31,"thirty one");
					

		HashMap<Integer,String> hash_Month = new HashMap<Integer,String>();
		//cretes a hashmap with arguments integer and String type having months from 1 to 12
			hash_Month.put(1,"january");
			hash_Month.put(2,"february");
			hash_Month.put(3,"march");
			hash_Month.put(4,"april");
			hash_Month.put(5,"may");
			hash_Month.put(6,"june");
			hash_Month.put(7,"july");
			hash_Month.put(8,"august");
			hash_Month.put(9,"september");
			hash_Month.put(10,"october");
			hash_Month.put(11,"november");
			hash_Month.put(12,"december"); 

			
			HashMap<Integer,String> hash_Year = new HashMap<Integer,String>();
		//creatas a hashmap with arguments integer and double type having year from 2011 to 2018
			hash_Year.put(2011,"two thousand eleven");
			hash_Year.put(2012,"two thousand tweleve");
			hash_Year.put(2013,"two thousand thirteen");
			hash_Year.put(2014,"two thousand fourteen");
			hash_Year.put(2015,"two thousand fifteen");
			hash_Year.put(2016,"two thousand sixteen");
			hash_Year.put(2017,"two thousand seventeen");
			hash_Year.put(2018,"two thousand eighteen");
			hash_Year.put(2019,"two thousand nineteen");
			hash_Year.put(2020,"two thousand twenty");
		
		//using the scanner class to get the date
				Scanner get_Date= new Scanner(System.in);
				System.out.println("Enter the date: ");
				String date = get_Date.nextLine();
				//3 string var convert the value to the integer type using the parseInt
				//using the substring to print take the values 
				int str = Integer.parseInt(date.substring(0,2));
				int str1 = Integer.parseInt(date.substring(3,4));
				int str2 = Integer.parseInt(date.substring(5));
				//prints out the date in the english format.
				System.out.println("DAY: "+hash_Days.get(str) + " MONTH: " + hash_Month.get(str1) + " YEAR: " + hash_Year.get(str2));
		
		
	}
	
}