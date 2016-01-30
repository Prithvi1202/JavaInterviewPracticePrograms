class TestImmutability{
	public static void main(String [] args){
	
		String s = "Hi";
		String s1 = " World";
		String s3 = s.concat(s1);
		System.out.println(s3);
	}

}