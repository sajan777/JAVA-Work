class Sub1_Array{
	
	public static void main(String[] args){
		int val = 1,max=1;
		int arr[] = {2,1,3,4,5,4,6,7,8,9,10}; 
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[i-1])
				val++;
			
			else{
				if(max<val)
				max=val;
			val=1;
			}
		}
		
		if(max<val)
		{
			max=val;
		
	}
	System.out.println(max);
	}
}