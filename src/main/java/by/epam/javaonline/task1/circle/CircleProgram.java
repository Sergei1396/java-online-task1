package by.epam.javaonline.task1.circle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircleProgram {


    public static void main(String[] args) {
        //////////////////////==============Циклы==========================
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int option1, option2 = 0;
        boolean loopTerminate = true;

        while (loopTerminate) {
            //Main Menu options
            System.out.println("1. Напишите программу, где пользователь вводит любое целое положительное число." +
                    "А программа суммирует все числа от 1 до введенного пользователем числа.= > Press to - > 1");
            System.out.println("2. Вычислить значения функции на отрезке [а,b] c шагом h: = > Press to - > 2");
            System.out.println("3.Найти сумму квадратов первых ста чисел. = > Press to - > 3");
            System.out.println("4.Составить программу нахождения произведения квадратов первых двухсот чисел. = > Press to - > 4");
            System.out.println("5.Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, " +
                    "модуль которых больше или равен заданному е. Общий член ряда имеет вид: = > Press to - > 5");
            System.out.println("6. Вывести на экран соответствий между символами и их " +
                    "численными обозначениями в памяти компьютера. = > Press to - > 6");
            System.out.println("7. Для каждого натурального числа в промежутке от m до n вывести все делители, " +
                    "кроме единицы и самого числа m и n вводятся с клавиатуры = > Press to - > 7");
            System.out.println("8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. = > Press to - > 8");
            System.out.print("9. Exit - > ");
            option1 = input.nextInt();

            switch (option1) {

                case 1:
                    //1. Напишите программу, где пользователь вводит любое целое положительное число.
                    // А программа суммирует все числа от 1 до введенного пользователем числа.
                    System.out.println(" Enter value n - >");
                    int n = scanner.nextInt();
                    function31(n);
                    break;
                case 2:
                    ////  2. Вычислить значения функции на отрезке [а,b] c шагом h:
                    System.out.println(" Enter value a - >");
                    double a = scanner.nextDouble();
                    System.out.println(" Enter value b - >");
                    double b = scanner.nextDouble();
                    System.out.println(" Enter value h - >");
                    double h = scanner.nextDouble();
                    funtion32(a, b, h);
                    break;
                case 3:
                    /////3. Найти сумму квадратов первых ста чисел.
                    function33();
                    break;
                case 4:
                    /////4. Составить программу нахождения произведения квадратов первых двухсот чисел.
                    function34();
                    break;
                case 5:
//                    5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//                    заданному е. Общий член ряда имеет вид:
                    double sum = function35();
                    System.out.println("Sum-> " + sum);
                    break;
                case 6:
                    //    6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
                    System.out.println(" Enter line of symbols c - >");
                    char c = scanner.next().charAt(0);
                    function36(c);
                    break;
                case 7:
                    //         7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//         m и n вводятся с клавиатуры.
                    System.out.println(" Enter value m - >");
                    int m = scanner.nextInt();
                    System.out.println(" Enter value n - >");
                    int n7 = scanner.nextInt();
                    function37(m, n7);
                    break;
                case 8:
//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
                    System.out.println(" Enter value a - >");
                    int a8 = scanner.nextInt();
                    System.out.println(" Enter value b - >");
                    int b8 = scanner.nextInt();
                    function38(a8, b8);
                    break;
                case 9:
                    loopTerminate = false;
                    return; //terminate outer menu

                default:
                    System.out.println("Invalid option");
            }
        }


    }

    //   5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//                    заданному е. Общий член ряда имеет вид:
    private static double function35() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter number elements in list - >");
        // number elements in list
        int n = scanner.nextInt();
        List<Double> list = new ArrayList<Double>(n);
        for (int i = 0; i < n; i++) {
            list.add(getA(i));
        }

        System.out.println(" Enter value a - >");
        double e = scanner.nextDouble();

        double sum = 0;
        for (Double a : list) {
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }

        return sum;

    }

    private static double getA(int n) {
        return 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
    }


    //////////////////////==============Циклы==========================
    //1. Напишите программу, где пользователь вводит любое целое положительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static void function31(int n) {

        int summ = 0;
        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                summ = summ + i;
            }
            System.out.println(summ);
        } else {

            System.out.println("Ckeck out n!!!!");
        }
    }

    //////////////  2. Вычислить значения функции на отрезке [а,b] c шагом h:
    public static void funtion32(double a, double b, double h) {
        double f = 0;
        double x = a;
        if (x <= 2) {

            for (double i = a; i <= b; i = i + h) {
                f = -i;
                System.out.println(" f - > " + f);
            }
        } else if (x > 2) {
            for (double i = a; i <= b; i = i + h) {
                f = i;
                System.out.println(" f - > " + f);
            }
        }

    }

    ///////==========///////3. Найти сумму квадратов первых ста чисел.
    public static int function33() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {

            sum += i * i;
        }
        System.out.println("Sum of squares - >" + sum);
        return sum;
    }

    /////4. Составить программу нахождения произведения квадратов первых двухсот чисел.
    public static int function34() {

        int proiz = 1;
        long x = 0;
        for (int i = 1; i <= 200; i++) {
            BigInteger a = BigInteger.valueOf(proiz *= (i * i));
            x = a.longValue();
        }
        System.out.println("Sum of squaries - >" + x);
        return proiz;
    }

    //    6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
    public static int function36(char c) {
        int code = (int) c;
        System.out.println("Symbol[" + c + "]=" + code);
        return code;
    }

    //         7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//         m и n вводятся с клавиатуры.
    public static void function37(int m, int n) {
        for (int i = m; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Divider - > " + i);
            }
        }
    }
//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

    public static void function38(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        System.out.println("Number a[" + a + "] contains digits:");
        printNumbers(strA);
        System.out.println("Number b[" + b + "] contains digits:");
        printNumbers(strB);

    }

    private static List<Integer> printNumbers(String strA) {
        char[] charsA = strA.toCharArray();
        List<Integer> numbers = new ArrayList(charsA.length);
        for (int i = 0; i < charsA.length; i++) {
            int number = charsA[i] - '0';
            System.out.println(number);
            numbers.add(number);
        }
        return numbers;
    }


}

