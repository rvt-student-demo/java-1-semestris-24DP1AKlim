package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1)
                break;

            list.add(input);
        }

        System.out.print("From where? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for (; from <= to; from++) {
            System.out.println(list.get(from));
        }
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty())
                break;

            list.add(input);
        }

        System.out.println("In total: " + list.size());
    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty())
                break;

            list.add(input);
        }

        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        strings.removeLast();
    }
}
