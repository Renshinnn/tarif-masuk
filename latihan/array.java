package com.latihan;

public class array {
    public static void main (String[] args){
        System.out.println("Pemjumlahan array");
        int[] a ={3,4};
        int[] b ={4,3};
        System.out.println("hasil a-b");
        for (int i=0;i<2;i++){
            System.out.println(a[i] - b[i]+"\t");
        }
        System.out.println("=========================================");
        System.out.println("Perkalian array");
        int[][] c ={{3},{4}};
        int[][] d ={{4},{5}};
        int[][] h ={{0},{0}};
        System.out.println("hasil a*b");
        for (int i=0;i<2;i++){
            for (int j=0;j<1;j++){
                for (int k=0;k<2;k++) {
                    System.out.println(h[i][j]=h[i][j]+c[i][k]*d[k][j]);
                }

            }

        }
        for (int i=0;i<2;i++){
            for (int j=0;j<1;j++){
                System.out.print(h[i][j]+"\t");
            }
        }
    }
}
