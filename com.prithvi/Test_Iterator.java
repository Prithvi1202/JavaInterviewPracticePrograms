//using iterator interface
import java.util.*;
class Test_Iterator{
	public static void main(String [] args){
	ArrayList<String> ar = new ArrayList<String>();
	
	ar.add("Java");
	ar.add("JSP");
	ar.add("JDBC");
	ar.add("Struts");
	
	Iterator it = ar.iterator();
	
	while(it.hasNext()){
		System.out.println(it.next()+"");
	}
}
}