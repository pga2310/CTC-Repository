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
public class GrowArray {
    public static void main(String arg[]){
        int[] arr = {1,2,3,4};
        int item = 5, position = 2, j = arr.length;
        int l=arr.length+1;
        
        for(int x : arr){
            System.out.println(x);
        }
        
        while(j >= position){
            arr[j+1] = arr[j];
            j--;
        }
        
        arr[position] = item;
        
        for(int x : arr){
            System.out.println(x);
        }
        
    }
}
