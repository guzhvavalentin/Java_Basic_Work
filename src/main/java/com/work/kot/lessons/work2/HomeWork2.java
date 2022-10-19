package com.work.kot.lessons.work2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);
        System.out.println("Угадай число от 0 до 10");
        System.out.println();
        System.out.println("Случайное число: " + randomNumber);

        System.out.println();

        for (int i = 3; i > 0; i--) {
            System.out.println("Осталось " + i + " попыток");
            int number = scanner.nextInt();
            if (number == randomNumber) {
                System.out.println("Ты плобедил!");
                break;
            } else if (i == 1) {
                System.out.println("Ты проиграл");
            }


        }
    }
}
