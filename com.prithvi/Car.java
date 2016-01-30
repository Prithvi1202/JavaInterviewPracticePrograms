abstract class Vehicle{
	public abstract int engine();
	
}

public class Car extends Vehicle{

	public int engine(){
		System.out.println("Car Engine");
		return 1;
	}
	/* public void Run(){
		System.out.println("Run method");
	}
	*/
	
	
	public static void main(String [] a){
		Vehicle v = new Car();
		int i = v.engine();
		System.out.println(i);
	//	v.Run();
	}
}