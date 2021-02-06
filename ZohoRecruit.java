package main.com.test;

import java.util.Scanner;

public class ZohoRecruit {

    public static void printPattern(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if((i == j) || (i > j)) {
                    System.out.print((size-j) + " ");
                } else {
                    System.out.print((size-i) + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();

       printPattern(size);
    }
}
