package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int heads = 0;
    static int tails = 0;
    static double headsPercent;
    static double tailsPercent;
    static int numOfTosses = 0;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n;

        while (numOfTosses >= 0) {
            System.out.print("Toss how many coins? ");
            numOfTosses = sc.nextInt();

            for (int i = 0; i < numOfTosses; i++) {
                n = random.nextInt(2) + 1;

                switch (n) {
                    case 1:
                        System.out.print("H");
                        heads++;
                        break;
                    case 2:
                        System.out.print("T");
                        tails++;
                        break;
                }
                System.out.print(" ");
            }

            System.out.println();
            headsPercent = (double) heads / count;
            tailsPercent = (double) tails / count;
            count = count + numOfTosses;
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println("Total: " + (heads + tails));
        System.out.println("\nHeads " + headsPercent * 100 + "%");
        System.out.println("Tails " + tailsPercent * 100 + "%");

    }
}
