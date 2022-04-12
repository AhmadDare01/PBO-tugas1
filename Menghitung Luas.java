/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.io.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static int persegi(int s){
        int hasil = s * s;
        return hasil;
    }
    public static int segitiga(Double a, Double t){
        int hasil = (int) (a * t / 2);
        return hasil;
    }
    public static double lingkaran(double r){
        double hasil = 22 / 7 * r * r;
        return hasil;
    }
    public static double lingkaran2(double r){
        double hasil = 3.14 * r * r;
        int hasil2 = (int)hasil; 
        return hasil2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        pilih = input.nextInt();
        if (pilih == 1){
            int sisi = input.nextInt();
            System.out.println(persegi(sisi));
        }
        else if (pilih == 2){
            double alas = input.nextDouble();
            double tinggi = input.nextDouble();
            System.out.println(segitiga(alas, tinggi));
        }
        else if (pilih== 3){
            double jari2 = input.nextDouble();
            if (jari2 % 7 == 0){
                System.out.println(lingkaran(jari2));
            }
            else 
                System.out.println(lingkaran2(jari2));
        }else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
