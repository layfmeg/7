package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number != randomNumber) {
            System.out.println("Угадайте число от 0 до 10: ");
            number = scanner.nextInt();
            System.out.println(number);

            if (number < 0 || number > 10) {
                System.out.println("Ошибка, введите число от 0 до 10");
            } else if (number > randomNumber) {
                System.out.println("заганное число меньше");
            } else if (number < randomNumber) {
                System.out.println("заганное число больше");
            } else {
                System.out.println("Вы угадали число, поздравляю4");
            }

        }
    }
}