 class Calculation{
	int z;
	public void addition(int x, int y){
		System.out.println("Addition: "+(x+y));
	}
	public void substraction(int x, int y){
		System.out.println("substraction: "+(x-y));
	}
}
public class My_calc extends Calculation {

	public void multiplication(int x, int y){
		System.out.println("Multiplication: "+(x*y));
	}
	public static void main(String [] args){
		int a = 20, b = 25; 
		My_calc demo = new My_calc();
		demo.addition(a,b);
		demo.substraction(a,b);
		demo.multiplication(a,b);
	}
}