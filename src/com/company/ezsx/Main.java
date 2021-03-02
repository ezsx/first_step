package com.company.ezsx;

import java.util.Scanner;


class Test {
    public static void printBytes() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some bytes: ");
        double input = in.nextDouble();
        int count = 0;
        while (input >= 1024) {
            input = input / 1024;
            count = count + 1;
        }

        char[] set = {' ', 'k', 'm', 'g', 't', 'p'};
        System.out.println("Your human bytes is " + String.format("%.1f", input) + " " + set[count] + "b ");

    }
}

public class Main {

    public static void main(String[] args) {
        Test.printBytes();

    }
}