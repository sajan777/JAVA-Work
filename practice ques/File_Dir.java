import java.io.*;
class File_Dir{
	public static void main(String[] args){
		
		File Folder = new File("C:\\Users\\Halfdevil\\Desktop\\JAVA Acadview\\class 10\\data");
		File[] file = Folder.listFiles();
		for(File file1 : file){
			System.out.println(file1.getName());
			if(file1.isDirectory()){
				
				File[] file2 = file1.listFiles();
				
				for(File file3 : file2){
					System.out.println(file3.getName());
				}
				
			}
			
		}
		
	}
	
}
