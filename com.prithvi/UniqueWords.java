import java.util.*;
class UniqueWords{
	static char separator = ' ';
	static String input = "Start by doing what is necessary; then do what is possible; and suddenly you are doing the impossible";
	public static void main(String [] args){
		UniqueWords uw = new UniqueWords();
		 ArrayList<String> data= uw.split(input);
		 HashMap<String, Integer> hm=new HashMap();
		
		 for(int i=0;i<data.size();i++){
			 if(hm.containsKey(data.get(i))){
				 hm.put(data.get(i), hm.get(data.get(i))+1);
			 }
			 else{
				 hm.put(data.get(i),1);
			 }	 
		 }
		 for (String stringvalue: hm.keySet()){

	            String key =stringvalue.toString();
	            String value = hm.get(stringvalue).toString();  
	            System.out.println(key + " " + value);  

		 } 
	}
	
	public ArrayList<String> split(String s){
		
		ArrayList<String> data=new ArrayList<String>();
		ArrayList<Character> substring = new ArrayList<Character>();
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != separator){
				substring.add(s.charAt(i));
			}
			else{
				StringBuilder result = new StringBuilder();
				for(Character c: substring){
					result.append(c);
				}
				
				data.add(result.toString());
				substring.clear();
				
			}
		}
		return data;
	}
	
}