import java.io.*;
import java.util.*;

class Threading_Demo{
	
	public static void main(String[] args) throws InterruptedException{
	
	System.out.println("Well hi from the main block.");
	//as main is also a Thread it has the highest priority .it executed first
			
		Threading_Demo1 td1 = new Threading_Demo1();
		//creating the refrences to the classes we created
		Threading_Demo2 td2 = new Threading_Demo2();
		
		//td1.start and td2.start starts the thread
		td1.start();
		//td1.join and td2.join starts the thread after holding
		td1.join();
		td2.start();
		td2.join();
	
}
}

class Threading_Demo1 extends Thread{
	
	//1st class to print till 0 to 500.
	
	@Override
	public synchronized void run(){
		
		System.out.println("1st Thread Running.");
		//first thread 
		for(int i=0;i<=500;i++){
			System.out.println(i);
			System.out.print("");
		}
		
	}
}

class Threading_Demo2 extends Thread{
	
	//2nd class to print till 501 to 1000.
	
	@Override
	public synchronized void run(){
		
		System.out.println("2nd Thread Running.");
				//Second thread 
		for(int i=501;i<=1000;i++){
			System.out.println(i);
			System.out.print("");
		}
		
	}
}