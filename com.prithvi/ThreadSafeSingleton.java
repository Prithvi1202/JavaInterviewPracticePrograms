class ThreadSafeSingleton {
 
    private static ThreadSafeSingleton instance;
     
    private ThreadSafeSingleton(){}
     
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
     
}

public class ThreadSafeSingletonTest{
	
	public static void main(String [] args){
		ThreadSafeSingleton singleInstance = EagerInitSingleton.getInstance();
		//ThreadSafeSingleton anotherInstance = EagerInitSingleton.getInstance();
		
		System.out.println(singleInstance);
		//System.out.println(anotherInstance);
	}
	
}