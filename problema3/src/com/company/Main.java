package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Consumer consumer = new Consumer();
     // Consumer c[] = new Consumer[10];
        consumer.readConsumers();
       System.out.println("Datele abonatilor sunt: \n ");
        consumer.viewConsumers();
        consumer.quickSort();
        System.out.println("Dupa sortare...\n");
        consumer.viewConsumers();
       System.out.println("\nPrimii 3 abonati sunt:\n");
        consumer.ShowFirstThree();

    }
}
