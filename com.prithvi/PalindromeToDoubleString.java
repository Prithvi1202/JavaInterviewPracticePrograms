package com.prithvi.doublestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeToDoubleString {

	public static void main(String[] args){
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine()), j;
			int a[] = new int[n]; 
			for(int i = 0; i<n ; i++){
				j = Integer.parseInt(br.readLine());
				if(j %2==0){
					a[i] = j;
				}
				else{
					a[i] = j-1;
				}
			}
			for(int k = 0; k<a.length ; k++){
				System.out.println(a[k]);
				}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
