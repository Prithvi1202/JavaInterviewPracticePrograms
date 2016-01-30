import java.io.*;
class DirInfo{
	public static void main(String [] args){
		File file = new File("f://Marlabs");
		System.out.println(file.canRead()?"readable" : "not readable");
		
		File newDir = new File("myDir");
		newDir.mkdir();
		
		String arr[] = file.list();
		for(int i = 0 ; i< arr.length; i++){
			File temp = new File("F://Marlabs/" + arr[i]);
			
			System.out.println(temp.isFile()? arr[i] + "is File" : arr[i] + "is Directory");
		}
	}
}