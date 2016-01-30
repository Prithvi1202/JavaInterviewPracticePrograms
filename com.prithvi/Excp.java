class Excp{
	public static void main(String [] ar){
		int a, b,c;
		try{
			a= 0;
			b = 10;
			c = b/a;
		}
		catch(ArithmeticException e ){
				System.out.println("divide by zero");
			}
	}
}