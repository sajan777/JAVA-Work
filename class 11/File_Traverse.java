import java.io.*;

class File_Traverse{
	public static void main(String[] args){
		
		File Folder = new File("C:\\Users\\Halfdevil\\Desktop\\JAVA Acadview\\class 11\\FileTraverse");
		
		File[] files_List = Folder.listFiles();
		
		System.out.println("abc File from the folder :");
			
		for(File New_File_List : files_List){
			
			System.out.println(New_File_List.getName() +": "+ New_File_List.getPath());
			
			if(New_File_List.isDirectory()){
				
				File[] Inner_files = New_File_List.listFiles();
				
				System.out.println("abc File from the inner folder different path: ");
				
				for(File Inner_files_List : Inner_files){
					System.out.println(Inner_files_List.getName() +": "+ Inner_files_List.getPath());
				}
				
			}
			
		}
	}
	
}