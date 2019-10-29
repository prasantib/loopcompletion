package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
        int num, total = 0;
        for (num = 0; num < 10; num++) {
            num = keyboard.nextInt();
            total += num;
        }
        System.out.println("The total of all 10 numbers is " + total);
    }
}
