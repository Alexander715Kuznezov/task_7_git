package ru.vsu.cs.kuznetsov;

import java.util.Scanner;

public class Main {

    public static void println(String str) {
        System.out.println(str);
    }

    public static int scanner(Scanner scn) {
        while (true) {
            String str = scn.nextLine();
            try {
                int x = Integer.parseInt(str);
                return x;
            } catch (Exception e) {
                println("Are you idiot? Enter correct letters!");
            }
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        println("Enter volume of array");

        int k = 0, d1 = 0, d2 = 0, p = 0;
        int n = scanner(scn);
        int arr[] = new int[n];
        println("Enter тгьиукы of array"); //пасхалка
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner(scn);
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (k > 0) {
                d1 = Math.abs(arr[i - 1]) - Math.abs(arr[i]);
                d2 = Math.abs(arr[i]) - Math.abs(arr[i+1]);
                if (d1 == d2) {
                } else {
                    p++;
                    k = 0;
                }
            }
            if (k == 0 && (arr[i] > arr[i + 1])){
                k++;
            }
        }
        System.out.print(p);
    }
}
