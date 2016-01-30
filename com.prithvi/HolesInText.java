
public  class HolesInText {
	
	String s;
	public int countHolesInText(String text1){
		 int count = 0;
		s = text1;
		for(int i =0; i< s.length();i++){
			if(text1.charAt(i) == 'A' ||text1.charAt(i) == 'D' ||text1.charAt(i) == 'O' ||text1.charAt(i) == 'P' ||text1.charAt(i) == 'R' || text1.charAt(i) == 'Q' )
			{
				count++;
			}
			else if(text1.charAt(i) == 'B'){
				count = count+2;
			}
			else{
	
			}
		}
				return count;
			
		
	}
}