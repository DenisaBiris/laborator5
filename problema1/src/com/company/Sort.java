package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class Sort {
     int arr[] = new int[10];
     int copie[] = new int[10];
     int n;


    public void generateValues()
    {
        Scanner scanner= new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Cate elemente doriti? ");
        n= scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=rand.nextInt(10);
            copie[i]=arr[i];
        }
    }

    public void viewArray()
    {
        for( int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"  ");

        }System.out.println();
    }

    public void backToInitial()
    {
        for(int i=0;i<n;i++)
        {
            arr[i]=copie[i];
        }
    }

    public void shellSort() throws InterruptedException
    { long start = currentTimeMillis();
    Thread.sleep(100);
        for (int gap = n/2; gap > 0; gap = gap/ 2)
        {
            for (int i = gap; i < n; i++)
            {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                arr[j] = temp;
            }
        }
       long end = currentTimeMillis();
        System.out.println("Duration "+(end-start));
    }


    public  void heapSort() throws InterruptedException
    {
        long start = currentTimeMillis();
        Thread.sleep(100);

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        long end = currentTimeMillis();
        System.out.println("Duration "+(end-start));
    }

    public  void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }

    }


     public void sortare(int s,int d)
          {

              int i,j;
          int x,w;  i=s;j=d;  x=arr[(i+j)/2];
        do  {   while (arr[i]<x) i=i+1;
        while (x<arr[j]) j=j-1;   if (i<=j)
        {  w=arr[i];arr[i]=arr[j];arr[j]=w;  i=i+1;j=j-1;
        }  } while (i<=j);
        if (s<j) sortare(s,j);
        if (i<d) sortare(i,d); }


       public  void quickSort()throws InterruptedException {
           long start = currentTimeMillis();
           Thread.sleep(100);
           int m = 1;
           int p = n;
           sortare(0, n - 1);

           long end = currentTimeMillis();
           System.out.println("Duration " + (end - start));

       }
}