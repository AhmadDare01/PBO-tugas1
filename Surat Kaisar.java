/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata1 = input.nextLine();
        int n = input.nextInt();
        String kata = "";
        System.out.println(enkripsi(kata,n,kata1));
  }
        public static String enkripsi (String kata, int n, String kata1){
        
        kata = "";
        char alfabet;
            
        for(int a = 0; a < kata1.length();a++){
            alfabet = kata1.charAt(a);
                if(alfabet >= 'a' && alfabet <= 'z'){
                    alfabet = (char) (alfabet + n);
                if(alfabet > 'z') {
                    alfabet = (char) (alfabet+'a'-'z'-1);
                    }
                    kata = kata + alfabet;
                }
                else if(alfabet >= 'A' && alfabet <= 'Z') {
                alfabet = (char) (alfabet + n);    
                    
                    if(alfabet > 'Z') {
                    alfabet = (char) (alfabet+'A'-'Z'-1);
                }
                    kata = kata + alfabet;
                    }else {
                    kata = kata + alfabet;   
                    }  
        }   
        return kata;
    }
}