class DT{
public static void main(String args[]){
	char ch = 'D';
	int num = ch; //implicit casting 
	System.out.println(num);
	
	byte b1 = 55 ; 
	byte b2 = 25 ;
	byte b3 = ((byte)(b1/b2)) ;//Explicit casting it will give output in decimal only

	System.out.println(b3);

	int y = 176;
	char ch2 = (char)y;
	System.out.println(ch2);
	}
}