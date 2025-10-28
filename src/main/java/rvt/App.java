package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Statistics stats = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();

        while (true) {
            int num = scanner.nextInt();

            if (num == -1)
                break;

            if (num % 2 == 0)
                statsEven.addNumber(num);
            else
                statsOdd.addNumber(num);

            stats.addNumber(num);
        }

        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());

        scanner.close();
    }
}
