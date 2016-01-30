class SimpleSingleton{
	private static SimpleSingleton instance = null;
	static int i = 0;
	
	private SimpleSingleton(){
		//instance = factorymethod();
	}
	public static SimpleSingleton factorymethod(){
		if(instance == null){
			instance = new SimpleSingleton();
			System.out.println("Number of instatnces are : " + ++i);
			return instance;
		}
		return null;
	}
	
	public void display(){
		System.out.println("This is display method of singleton");
		
	}

}

public class SimpleSingletonTest{

	public static void main(String [] args){
		//SimpleSingleton singleInstance;
		SimpleSingleton s = SimpleSingleton.factorymethod();
		s.display();
		SimpleSingleton s2 = SimpleSingleton.factorymethod();
		System.out.println(s);
		System.out.println(s2);
		//s2.display();
	}
}