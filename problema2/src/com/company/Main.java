package com.company;


import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            // write your code here
            //int v[] ={4,12,0,7,56,9,23,36};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Cate elemente are vectorul?\n");
            int n = scanner.nextInt();
            int v[] = new int[n];
            int par[] = new int[(n%2!=0) ? (n/2) +1 : n/2];
            int impar[] = new int[n/2];
            int arr[] = new int[n];
            int p = par.length;
            int q = impar.length;

            Values value = new Values();
            value.readValues(v,n);
            System.out.println("Vectorul initial: ");value.viewValues(v, n);
            value.divide(par,par.length,impar,impar.length,v,v.length);
            System.out.println("\nVector 1: ");value.viewValues(par,par.length);
            System.out.println("\nVector 2: "); value.viewValues(impar,impar.length);
            value.shellSort(par,par.length);System.out.println("\nVectorul 1 sortat: "); value.viewValues(par,par.length);
            value.heapSort(impar,impar.length); System.out.println("\nVectorul 2 sortat: "); value.viewValues(impar,impar.length);
            value.merge(par,par.length,impar,impar.length,arr);
            System.out.println("\nVectorul final este: "); value.viewValues(arr,par.length+impar.length);
      }
}
