class NSB{
	static int y = 25;
	int x;
	NSB(){
		System.out.println("Inside cons");
	}
	NSB(int x){
		System.out.println("inside 1 args cons");
	}
	{
		int x = 50;
		this.x = 25;
		
	}
	static{
		y++;
	}
	public static void main(String [] args){
		y++;
		System.out.println(y);
		//System.out.println(this.x);
		//System.out.println(x);
		NSB n1 = new NSB();
		NSB n2 = new NSB(y);
		n1.show();
	}
	void show(){
		System.out.println("Inside method");
		System.out.println(x);
		System.out.println(y);
	}
}