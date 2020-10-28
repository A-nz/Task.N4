package ru.vsu.n2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = getDouble("a");
        double h = getDouble("h");
        int n = getInteger("n");

        printResult(getFunctionValue(a, h, n));
    }

    private static double getFunctionValue(double a, double h, double n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result = (getfunktion(a + i * h)) + result;
        }
        return result;
    }

    private static double getDouble(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", NameOfValue);
        return scanner.nextDouble();
    }

    private static int getInteger(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", NameOfValue);
        return scanner.nextInt();
    }

    private static double getfunktion(double x) {
        return (((x * x) + 1) * Math.cos(x));
    }

    private static void printResult(double result) {
        System.out.printf("результат последовательности = %.3f", result);
    }
}
