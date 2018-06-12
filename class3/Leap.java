class Leap{
	
	public static void main(String[] args){
		int year = 1900;
		//Lets take an i/p for  a year
		boolean  Check_Leap = false;
		//create a boolean var name check_Leap initalized to false
		if(year%4 == 0){
			//we divide by 4 to check the remainder and if rem==0
			//then the year is a leap year
			if(year%100 == 0)
			//we divide by 100 due to century years ex 1600
		//and 2000 are leap year
			{
				if(year%400 == 0)
				//but years 1700,1800,1900 are not 
			//due to leap year happens after every 400 year
				Check_Leap = true;
				else
				Check_Leap = false;
			}
			else
			Check_Leap = true;	
		}
		else
			Check_Leap =false;

			if (Check_Leap)
				//condition runs only if check_leap is passed true
		System.out.println(year + " hurra thats a leap year");
		else
			System.out.println(year + "Sorry not a leap year");
		
	}
	

	
	
}