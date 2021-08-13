package com.company;

import java.util.Scanner;

public class Main
{
    public  static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите A");
        int A = in.nextInt();
        System.out.println("Введите B");
        int B = in.nextInt();
        for (int i = A; A <= B; A++)
        {
            System.out.println(A);
        }
        System.out.println("Введите B");
        int B1 = in.nextInt();
        System.out.println("Введите A");
        int A1 = in.nextInt();
        for (int i = B1; B1 > A1; B1--)
        {
            System.out.println(B1);
        }
        System.out.println(" ");
        System.out.println("Введите A");
        double A2 = in.nextDouble();
        double N = in.nextDouble();
        double s = 1;
        for (double i = 1; i <= N; i++)
        {
            s *= A2;
            System.out.println(s);
        }
    }
}
