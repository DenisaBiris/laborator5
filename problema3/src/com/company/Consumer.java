package com.company;

import java.util.Scanner;

import static java.lang.System.currentTimeMillis;

public class Consumer {
    public String name;
    public  String adress;
    public long no;
    public int invoice;
    public int n;
    Consumer c[] = new Consumer[10];
    Scanner scanner = new Scanner(System.in);
    public void readConsumers()
    {   System.out.println("Introduceti numarul de abonati ai serviciului de telefonie(n>3):\n");      System.out.flush();

        n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {   c[i] = new Consumer();
            System.out.flush();

            System.out.println("Nume: ");
            System.out.flush();
            ((Consumer)c[i]).name = scanner.next();
            scanner.nextLine();
            System.out.println("Adresa: ");
            System.out.flush();
            ((Consumer)c[i]).adress = scanner.next();
            scanner.nextLine();
            System.out.println("Numar de telefon: ");
            System.out.flush();
            ((Consumer)c[i]).no = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Valoarea facturii: ");
            System.out.flush();
            ((Consumer)c[i]).invoice = scanner.nextInt();

        }

    }

    public void viewConsumers()
    { for(int i=0;i<n;i++){
        System.out.println("Nume: "+((Consumer)c[i]).name);
        System.out.println("Adresa: "+((Consumer)c[i]).adress);
        System.out.println("Numar de telefon: "+((Consumer)c[i]).no);
        System.out.println("Valoarea facturii: "+((Consumer)c[i]).invoice);

    }




    }


    public void sortare(int s,int d)
    {

        int i,j;
        Consumer x;
        Consumer w;
        i=s;j=d;  x=c[(i+j)/2];
        do  {   while (((Consumer)c[i]).invoice>((Consumer)x).invoice)
            i=i+1;
            while( ((Consumer)x).invoice>((Consumer)c[j]).invoice )
                j=j-1;
            if (i<=j)
            {  w=c[i];
            c[i]=c[j];
            c[j]=w;
            i=i+1;
            j=j-1;
            }  } while (i<=j);
        if (s<j) sortare(s,j);
        if (i<d) sortare(i,d); }


    public  void quickSort() {
        int m = 1;
        int p = n;
        sortare(0, n - 1);
    }

    public void ShowFirstThree()
    {
        for(int i=0;i<3;i++)
            System.out.println((i+1)+".Factura de "+((Consumer)c[i]).invoice+" lei cu numele "+((Consumer)c[i]).name);



    }



}
