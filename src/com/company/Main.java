package com.company;

import java.util.Scanner;

public class Main {
    static Scanner in=new Scanner(System.in);
    public static void anotherSort(int[] a) {
        int[] b = new int[a.length];

        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[counter] = a[i];
                counter++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[counter] = a[i];
                counter++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

    }

    public static void main(String[] args) {
	// write your code here
        int k= in.nextInt();
        int a[]=new int[k];
        for (int i = 0; i < a.length; i++) {
            a[i]= in.nextInt();
        }
        anotherSort(a);
    }


}

