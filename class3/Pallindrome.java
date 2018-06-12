class Pallindrome{
	
	public static void main(String[] args){
		int  n=1331,last_value=0,reminder=0;
		//lets take 2 var and iniatlize them to zero
		//and a variable name n that stores the value of no
		int temp=n;
		//here take another var that stores the value of the n
		while(temp!=0)//loop that checks if the no entered is zero and repeat until temp gets equal to zero
		{
		reminder=temp%10;
		//stores the remainder through modulus
		last_value=(lastanswer*10)+reminder;
		temp=temp/10;
		//changes value of temp
		}
		System.out.println(last_value);
		//prints last known value

		if(last_value==n)//if else for comparison b/w n and the last value 
		System.out.println(n + " is a pallindrome");
		else
		System.out.println(n + "is not a pallindrome");


		}
		
	
}