package com.work.kot.lessons.work1;

import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("введи имя:");
        String name = scanner.nextLine();

        System.out.println("веди число:");
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Ты ввел не число");
            System.exit(0);
        }

        scanner.nextLine();

        System.out.println("введи второе имя:");
        String name2 = scanner.nextLine();

        System.out.println("веди второе число:");
        int number2 = 0;
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        } else {
            System.out.println("Ты ввел не число");
            System.exit(0);
        }

        int result = number + number2;
        System.out.println("общий возраст: " + result);


    }
}
