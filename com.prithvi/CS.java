class CS{
	public static void main(String args[]){
			int x = 2;
			switch(x){
				case 0 : System.out.println("Java"); break;
				case 1 : System.out.println("JDBC"); break;
				case 2 : System.out.println("JSP"); break;
				default :System.out.println("Structs");
				
			}
			int a = 10, b = 20;
			int c = a++ + b++; //unary operator 
			System.out.println(c);
			System.out.println(a+ " :" +b );
	
	}
}