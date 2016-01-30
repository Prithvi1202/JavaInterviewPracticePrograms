class MOVer{
	public void show(){
		System.out.println("Java");
	}
	
}

class MOverride extends MOVer{
	public void show(){
		super.show();
		System.out.println("Method Overriding");
		
	}
	
	public static void main(String a[]){
		MOverride obj = new MOverride();
		obj.show();
	}
}