package com.work.kot.lessons.work2;

public class HomeWork {
    public static void main(String[] args) {

        int shuttle = 0;
        for (int i = 1; i < 101; i++) {
            if ((i == 4 || i == 9) || (i / 10 == 4 || i /10 == 9) || (i % 10 == 4 || i % 10 == 9)) {
                continue;
            }
            System.out.println("Номер шатла: " + i);
            shuttle++;
        }
        for (int i = 101; i < 200; i++) {
            if (shuttle >= 100) {
                break;
            }
            if ((i == 14 || i == 19) || (i / 10 == 14 || i /10 == 19) || (i % 10 == 4 || i % 10 == 9)) {
                continue;
            }
            System.out.println("Номер шатла: " + i);
            shuttle++;
        }
        int sum = shuttle;
        System.out.println("Всего количество шатлов отправленно: " + sum);

    }

    }

