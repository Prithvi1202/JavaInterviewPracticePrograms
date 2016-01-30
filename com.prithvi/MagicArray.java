class MagicArray{
	public static void main(String [] args){
		int arr[][] = new int[5][];
		int count = 1;
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = new int[count];
			count++;
		}
		int temp = 101;
		for(int i = 0; i<arr.length;i++){
			for(int j = 0; j<i+1; j++){
				arr[i][j] = temp;
				temp++;
				System.out.print(arr[i][j] + ",");
				
			}
			System.out.println("\n");
		}
	}
}


/*
		a[0] 	a[1] 	a[2]
a[0]	10 		 
a[1]	20		30 		40 	 
*/