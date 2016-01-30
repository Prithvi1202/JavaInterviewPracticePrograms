class ThreadSafeSingleton {
 
    private static ThreadSafeSingleton instance;
     
    private ThreadSafeSingleton(){}
     
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
     
	 /*synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }*/
}

public class ThreadSafeSingletonTest{
	
	public static void main(String [] args){
		ThreadSafeSingleton singleInstance = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton anotherInstance = ThreadSafeSingleton.getInstance();
		
		System.out.println(singleInstance.hashCode()); //same instance
		System.out.println(anotherInstance.hashCode());//same instance
	}
	
}