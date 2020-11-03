package ru.vsu.n2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = readDouble("a");
        double h = readDouble("h");
        int n = readInteger("n");
        printResult(calcGx(a, h, n));
    }

    private static double calcGx(double a, double h, double n) {
        double result = 0;
        for (int i = 0; i <= n; i++) {
            result = (calcFx(a + i * h)) + result;
        }
        return result;
    }

    private static double readDouble(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", NameOfValue);
        return scanner.nextDouble();
    }

    private static int readInteger(String NameOfValue) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", NameOfValue);
        return scanner.nextInt();
    }

    private static double calcFx(double x) {
        return (((x * x) + 1) * Math.cos(x));
    }

    private static void printResult(double result) {
        System.out.printf("результат последовательности = %.3f", result);
    }
}
