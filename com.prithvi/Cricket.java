class Game{
	public void type(){
		System.out.println("Indoor and Outdoor");
	}
}	
public class Cricket extends Game{
		public void type(){
			System.out.println("OutDoor Game");
		}
		
public static void main(String [] args){
	Game gm = new Game();
	Cricket ck = new Cricket();
	gm.type();
	ck.type();
	gm = ck; // gm refers to cricket object
	gm.type(); // calls crickets version of type
	
	}
}
	
