class SimpleIterations{

	public static void main(String args[]){

	int x = 3; 
	while (--x>0){
		System.out.println("Hello");
	}
		System.out.println("---------");
	x = 3;
	do{
		System.out.println("Hello");
	}
	while(x-->=0);

	for(int i = 0 ; i<3;i++){
		for(int j =0 ; j <3;j++){
			if(j==2){
				break;
			}
			else
			{
				System.out.println("i = " +i  + " and  j = " + j);
			}
		}
	}
	}
}