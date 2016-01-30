class Add{
	int a ; 
	int b ;
	
	Add(int a , int b){
		this.a = a;
		this.b = b;
		
	}

	void sum(){
		int result = a+b;
		System.out.println(result);
		
	}
	
	public static void main(String [] a ){
		Add obj = new Add(10, 20);
		obj.sum();
	}
}