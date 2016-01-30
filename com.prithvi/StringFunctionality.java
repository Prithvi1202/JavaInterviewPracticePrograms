import java.util.Arrays;

public class StringFunctionality {
	
	String str	;
	
	public StringFunctionality(String str){
		this.str = str;
	}
	
	
	public int length(){
		char[] arr = str.toCharArray();
		int length = arr.length;
		return length;
		
	}
	
	public String toUpperCase(){
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++){
			if((int) arr[i]<= (int)'z' && (int) arr[i] >= (int) 'a'){
				arr[i] = (char) (arr[i] - (((int)'a')-((int)'A')));
			}
		}
		String temp = new String(arr);
		return temp;
	}
	
	
	public char charAt(int temp){
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++){
			if (i == temp){
				return arr[temp];
			}
		}
		return 0; 
	}
	
	public String replace(char old, char ne){
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] == old){
				arr[i] = ne;
			}
		}
		String temp = new String(arr);
		return temp;
	}
	
	public String subString(int index){
		char[] arr = str.toCharArray();
		char[] arrNew = new char[str.length()-index];
		for(int i = 0; i < arrNew.length; i++){
			arrNew[i] = arr[index + i];
		}
		String temp = new String(arrNew);
		return temp;
	}
	
	public String subString(int begin, int end){
		char[] arr = str.toCharArray();
		char[] arrNew = new char[end-begin];
		for(int i = 0; i < arrNew.length; i++){
			arrNew[i] = arr[begin + i];
		}
		String temp = new String(arrNew);
		return temp;
	}
	
	public boolean startsWith(String start){
		char[] arr = str.toCharArray();
		char[] arrCheck = start.toCharArray();
		boolean flag = false;
		for(int i = 0; i < start.length(); i++){
			if(arr[i] == arrCheck[i])
				flag = true;
			else{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public boolean endsWith(String end){
		char[] arr = str.toCharArray();
		char[] arrCheck = end.toCharArray();
		boolean flag = false;
		int j = 0;
		for(int i = arr.length-arrCheck.length; i < arr.length; i++,j++){
			if(arr[i] == arrCheck[j])
				flag = true;
			else{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	
	public String insert(int index, String insert){
		char[] arr = str.toCharArray();
		char[] arr0 = Arrays.copyOf(arr, index);
		char[] arr1 = insert.toCharArray();
		char[] arr2 = Arrays.copyOfRange(arr, index,str.length());
		String str0 = new String(arr0);
		String str1 = new String(arr1);
		String str2 = new String(arr2);
		return str0 + str1 + str2;
	}
	
	public String delete(int index){
		char[] arr = str.toCharArray();
		char[] arr0 = Arrays.copyOf(arr, index);
		char[] arr1 = Arrays.copyOfRange(arr, index + 1, str.length());
		String str0 = new String(arr0);
		String str1 = new String(arr1);
		return str0 + str1;
	}
	
	public String reverse(){
		char[] arr = str.toCharArray();
		char[] arrNew = new char[arr.length];
		for(int i = 0; i < arr.length; i++){
			arrNew[arr.length-1-i] = arr[i]; 
		}
		String temp = new String(arrNew);
		return temp;
	}
	
	public String setCharAr(int index, char set){
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++){
			if(i == index){
				arr[i] = set;
			}
		}
		String temp = new String(arr);
		return temp;
	}
	
	public boolean contains(String contain){
		char[] arr = str.toCharArray();
		char[] con = contain.toCharArray();
		boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			int j = 0;
			if(arr[i] == con[j]){
				for(;j<con.length;j++){
					if(arr[i+j] == con[j])
						flag = true;
					else{
						flag = false;
						break;
					}
				}
			}
		}
		return flag;
	}

	public int compareTo(String comp){
		int compareValue = 0;
		char[] arrStr = str.toCharArray();
		char[] arrCom = comp.toCharArray();
		for(int i = 0; i < str.length(); i++){
			if(arrStr[i] != arrCom[i]){
				compareValue = arrStr[i] - arrCom[i];
				break;
			}
			else
				continue;
		}
		return compareValue;
	}
	public static void main(String[] args) {
		
		StringFunctionality obj = new StringFunctionality("Prithvi Patel");
		System.out.println("Length Method: " + obj.length());
		System.out.println("toUpperCase Method: " + obj.toUpperCase() );
		System.out.println("CharAt 3 Method: " + obj.charAt(3));
		System.out.println("Replace Method: " + obj.replace('i', 'u'));
		System.out.println("SubString Method: " + obj.subString(3));
		System.out.println("SubString Method: " + obj.subString(3,7));
		System.out.println("StartWith Method: " + obj.startsWith("P"));
		System.out.println("EndWith Method: " + obj.endsWith("el"));
		System.out.println("Insert Method: " + obj.insert(2, "Hate"));
		System.out.println("Delete Method: " + obj.delete(4));
		System.out.println("Reverse Method: " + obj.reverse());
		System.out.println("SetCharAt Method: " + obj.setCharAr(4, 'X'));
		System.out.println("Contains Method: " + obj.contains("thvi"));
		System.out.println("CompareTo Method: " + obj.compareTo("Pruthvi Patel"));
		
	}
}
