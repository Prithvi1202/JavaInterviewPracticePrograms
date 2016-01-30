class Vowels{
	public static void main(String[] args){
		String input = "necessary possible impossible";
		
		for(int i = 0; i< input.length();i++){
			switch(input.toLowerCase().charAt(i)){
			case 'a':
				System.out.println(input.charAt(i) + ":" + i);	break;
			case 'e':
				System.out.println(input.charAt(i) + ":" + i);	break;
			case 'i':
				System.out.println(input.charAt(i) + ":" + i);	break;
			case 'o':
				System.out.println(input.charAt(i) + ":" + i);	break;
			case 'u':
				System.out.println(input.charAt(i) + ":" + i);	break;
			}
		}
	}

}