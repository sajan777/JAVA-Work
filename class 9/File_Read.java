import java.io.*;
import java.util.*;

class File_Read{
	public static void main(String[] args) throws IOException{
		//used IOException because the file may not exist
		
 		
		FileInputStream fis = new FileInputStream("C:\\Users\\Halfdevil\\Desktop\\JAVA Acadview\\class 9\\abc.txt");
		//use the file input stream and add a path to access the file.
		int c;
		while(( c = fis.read()) != -1){
		//loop to check till the end of the file
		System.out.print((char)c);
		//convert the int into char using (char)
	}
	}
}
	
