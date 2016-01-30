class Superclass{
	int age;
	Superclass(int age){
		this.age = age;
	}
	public void getAge(){
		System.out.println("The valur of the varable named age in super class id : "+ age);
		
	}
	
	
}

public class Subclass extends Superclass{
	Subclass(int age){
		super(age);//invoke constructor of super class
		
	}
	
	public static void main(String [] args){
		Subclass s = new Subclass(23);
		s.getAge();
		
	}
	
	
}