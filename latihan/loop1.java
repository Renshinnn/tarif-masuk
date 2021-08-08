package com.latihan;
import java.util.Scanner;

public class loop1 {

    public static void main(String[] args) {
	    // soal nomor 1
        int a=18;
        int b=4;
        int n=8;
        int u=a;
        int s=a;

        System.out.println("Deret aritmatikanya adalah : ");
        for (int i=0;i<n;i++){
            System.out.println(u);
            u=u+b;
            s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah aritmatika : "+s);
        System.out.println("==============================================");
        //soal nomor 2

        System.out.println("Matriks 3x2");
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            s=s-u;
            System.out.println(" ");
        }
        System.out.println("==============================================");
        //soal nomor 3
        System.out.println("Matriks segitiga siku ke bawah");
        for (int i=0;i<3;i++){
            for (int j=0;j<1+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            s=s-u;
            System.out.println(" ");
        }
        System.out.println("==============================================");
        //soal nomor 4
        System.out.println("matriks segitiga model 1");
        for (int i=0;i<5;i++){
            for (int j=0;j<i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        System.out.println("==============================================");
        //soal nomor 4
        System.out.println("matriks segitiga model 2");
        for (int i=0;i<4;i++){
            for (int j=0;j<4-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<2+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println(" ");
        }


    }
}
