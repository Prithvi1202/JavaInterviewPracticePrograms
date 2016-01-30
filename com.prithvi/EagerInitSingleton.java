class EagerInitSingleton {
     
    private static final EagerInitSingleton instance = new EagerInitSingleton();
    private static int i = 0;
    private EagerInitializedSingleton(){
		
	}
 
    public static EagerInitializedSingleton getInstance(){
		System.out.println(i++);
	   return instance;
    }
}

public class EagerInitSingletonTest{
	
	public static void main(String [] args){
		EagerInitSingleton singleInstance = EagerInitSingleton.getInstance();

	}
	
}