package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Values {
    Scanner scanner = new Scanner(System.in);
    int i;
    int v[];
    int n;
    Random rand = new Random();

    public void readValues(int v[],int n) {

        for (int i = 0; i < n; i++) {
            v[i] = rand.nextInt(100);

        }
    }

    public void viewValues(int v[],int n) {
        String stringArr = Arrays.toString(v);
            System.out.println( stringArr);
        }




    public void heapify(int v[], int n, int i)
    {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && v[l] < v[smallest])
            smallest = l;

        if (r < n && v[r] < v[smallest])
            smallest = r;

        if (smallest != i) {
            int temp = v[i];
            v[i] = v[smallest];
            v[smallest] = temp;

            heapify(v, n, smallest);
        }
    }

    public void heapSort(int v[], int n)
    {
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(v, n, i);
        for (int i = n - 1; i >= 0; i--) {

            int temp = v[0];
            v[0] = v[i];
            v[i] = temp;

            heapify(v, i, 0);
        }
    }

    public void shellSort(int v[],int n)
    {

        for (int gap = n/2; gap > 0; gap /= 2)
        {
            for (int i = gap; i < n; i += 1)
            {
                int temp = v[i];

                int j;
                for (j = i; j >= gap && v[j - gap] > temp; j -= gap)
                    v[j] = v[j - gap];


                v[j] = temp;
            }
        }
    }
    public void divide(int par[],int p,int impar[],int q,int v[],int n) {
        p=0;q=0;
        for (i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                par[p] = v[i];
                p++;
            } else {
                impar[q] = v[i];
                q++;
            }}


    }

    public void merge(int par[],int p,int impar[],int q, int arr[])
    {
        int i = 0, j = 0, k = 0;
        while (i < p && j < q)
        {arr[k] =par[i];
            i += 1;
            k += 1;
            arr[k] = impar[j];
            j += 1;
            k += 1;
        }
        if(i<par.length){
            arr[k] = par[i];
            i++;}
    }
}

