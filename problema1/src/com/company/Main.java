package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) throws InterruptedException {
                // write your code here
                int arr[] = new int[10];

                Scanner scanner = new Scanner(System.in);
                Sort sort = new Sort();

                char choice;
                System.out.println("......MENIU.......");
                System.out.println(" C - Valori generate aleator");
                System.out.println(" V - Vizualizeaza tabloul");
                System.out.println(" R - reinitializeaza tabloul");
                System.out.println(" S - Sortare prin SHELLSORT");
                System.out.println(" T - Sortare prin HEAPSORT");
                System.out.println(" H - Sortare QUICKSORT");
                System.out.println(" X - Parasire program");
                int n = arr.length;
                do
                {System.out.println("Alegeti o optiune: ");
                    choice=scanner.next().charAt(0);
                    choice=Character.toUpperCase(choice);
                    switch(choice)
                    {
                        case 'C': sort.generateValues(); break;
                        case 'V': sort.viewArray(); break;
                        case 'R': sort.backToInitial(); break;
                        case 'S': sort.shellSort(); break;
                        case 'T': sort.heapSort(); break;
                        case 'H': sort.quickSort();break;
                        case 'X': System.out.println("Ati ales sa parasiti programul! :("); break;
                        default: System.out.println("Optiune eronata!"+"\n"+"Mai incearca!"+"\n");}}
                while(choice!='x' && choice!='X');

            }

        }



