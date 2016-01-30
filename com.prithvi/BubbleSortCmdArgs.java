
public class BubbleSortCmdArgs {

	public static void main(String []args){
		int arr[] = new int[args.length];

		for(int i = 0 ; i<args.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		bubbleSort(arr, arr.length);
		System.out.print("Sorted array is ");
		
		for(int i = 0 ; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public static void bubbleSort( int a[], int n )
	{
		int i, j ,t=0;
		for(i = 0; i < n; i++)
		{
			for(j = 1; j < (n-i); j++){
				if(a[j-1] < a[j]){
					t = a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
 
	}
}	
