interface Moveable{
	int AVG_SPEED = 40;
	void move();
	
}

class Vehicle implements Moveable{
	public void move(){
		
		System.out.println("AVG-SPEED is : "+AVG_SPEED);
		
	}
	
	public static void main(String [] args){
		Vehicle v = new Vehicle();
		v.move();
	}
	
}