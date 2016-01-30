class SB{
	
	static int x = 20;
	static {
		System.out.println(x);
	}
	public static void main(String [] args){
		x++;
		System.out.println("main " +x);
		show();
	}
	static void show(){
		x++;
		System.out.println("static void show "+x);
	}
	static {
		x++;
		System.out.println("static "+x);
	}
	
}