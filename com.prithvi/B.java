// abstract class with concrete methods
 abstract class A{
	abstract void callme();
	public void normal(){
		System.out.println("Normal method");
	}
	
}

class B extends A{
	void callme(){
		System.out.println("CAll me");
	}
	
	public static void main(String [] args){
		B b = new B();
		b.callme();
		b.normal();
	}
}