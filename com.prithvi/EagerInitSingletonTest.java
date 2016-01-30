class EagerInitSingleton {
     
    private static final EagerInitSingleton instance = new EagerInitSingleton();
   // private static int i = 0;
    private EagerInitSingleton(){
		
	}
 
    public static EagerInitSingleton getInstance(){
	//	System.out.println(++i);
	   return instance;
    }
}

public class EagerInitSingletonTest{
	
	public static void main(String [] args){
		EagerInitSingleton singleInstance = EagerInitSingleton.getInstance();
		EagerInitSingleton anotherInstance = EagerInitSingleton.getInstance();
		
		System.out.println(singleInstance.hashCode());//same instance
		System.out.println(anotherInstance.hashCode());//same instance
	}
	
}