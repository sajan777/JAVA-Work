import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;

class File_Manipulation{
	public static void main(String[] args) throws IOException {
		
	
	File f1 = new File("E:\\file1.txt");
	File f2 = new File("E:\\file2.txt");
	File f3 = new File("E:\\file3.txt");
	//creating refrences to the file1 and file 2
	
		FileReader fis = new FileReader(f1);
		FileReader fis1 = new FileReader(f2);
		FileWriter fos = new FileWriter(f3);
		//using file reader and writer class and passing the refrences of files.
	
		BufferedReader bsi = new BufferedReader(fis);
		BufferedReader bsi1 = new BufferedReader(fis1);
		BufferedWriter bso = new BufferedWriter(fos);
		//buffredreader and writer used here 
			
		String r1; 
		String r2;
		while(((r1 = bsi.readLine()) != null) && (((r2 = bsi1.readLine()) != null))){
				
			System.out.println(r1);
			System.out.println(r2);
		
		
		}
	}
}