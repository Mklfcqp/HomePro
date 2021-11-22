package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }

    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input;
        do {
            input = Support.safeReadInt();
            System.out.println("You entered: " + input);
        } while (input >= 0);
    }

    public static int sumAllInputUntilNegative() {
        int sum = 0, input = 0;
        while (input >= 0) {
            sum += input;
            input = Support.safeReadInt();
        }
        return sum;
    }

    public static List storeAllInputInArrayListUntilNegative() {
        int input = 0;
        List<Integer> result = new ArrayList<>();
        while (input >= 0) {
            input = Support.safeReadInt();
            result.add(input);
        }
        result.remove(result.size()-1);
        return result;
    }

    public static void printAllIntegersFromList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static Integer sumAllIntegersFromList(List<Integer> list) {
        Integer result = 0;
         for (Integer i : list) {
            result += i;
        }
        return result;
    }

    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        for (Integer i : list) {
            if (i < limit) System.out.println(i);
        }
    }

    public static void printIntegersWithReplace(List<Integer> list) {
        for (Integer i : list) {
            switch(i) {
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                default: System.out.println(i); break;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println("--- Example - read and print one integer ---");
        readOneIntFromInputAndPrintIt();

        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();

        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());;

        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);

        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);

        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));

        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);

        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}
