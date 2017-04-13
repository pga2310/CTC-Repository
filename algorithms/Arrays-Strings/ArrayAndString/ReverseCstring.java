/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayAndString;

/**
 *
 * @author Pushpak
 */
public class ReverseCstring {
   public static void main(String args[]){
		String s = "abcd";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String input){
		char[] data = input.toCharArray();
		int i = 0;
		int j = data.length - 1;
		char temp;
		
		while(i < j){
			temp = data[i];
			data[i] = data[j];
			data[j] = temp;
			i++;
			j--;
		}
		
		String s = new String(data);
		return s;
	}
}
