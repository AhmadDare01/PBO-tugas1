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
        int saldo;
        saldo = input.nextInt();
        int setor;
        setor = input.nextInt();
        
        if (saldo > 0 && setor > 0){
            int jumlah = saldo + setor;
            int fee = jumlah - 7000;
            double bonus = (fee*0.05)/100;
            double total = fee + bonus;
            System.out.println(total);
        }else {
            System.out.println("anda salah memasukkan inputan");
        }
    }
}