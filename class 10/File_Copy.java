import java.io.*;
import java.io.BufferedReader;

class File_Copy {
	
	public static void main(String[] args) throws IOException{
	File f1 = new File("C:\\Users\\Halfdevil\\Desktop\\JAVA Acadview\\class 10\\abc.txt");
	File f2 = new File("C:\\Users\\Halfdevil\\Desktop\\JAVA Acadview\\class 10\\xyz.txt");
	//creating refrences to the file1 and file 2
	
		FileReader fis = new FileReader(f1);
		FileWriter fos = new FileWriter(f2);
		//using file reader and writer class and passing the refrences of files.
	
		BufferedReader bsi = new BufferedReader(fis);
		BufferedWriter bso = new BufferedWriter(fos);
		//buffredreader and writer used here 
		
		String rd;
		String wrt;
		
		while((rd = bsi.readLine()) != null){
			//loop till the data gets read from the file
			System.out.println("The data that is to be printed: ");
			System.out.print(rd);
			//print out the contents to the console
			
			bso.write(rd);
			//writes to the file
			bso.flush();
			//flush copies the whole data at a single point of time
			System.out.println("\n");
			System.out.println("After the data got printed: ");
			
			System.out.print(rd);
			
		}
	}
	
	}