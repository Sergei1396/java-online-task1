package by.epam.javaonline.task1.line;

import java.util.Scanner;

public class LineProgram {

    public static void main(String[] args) {
        //////////////=================Линейный программы=====================
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int option1, option2 = 0;
        boolean loopTerminate = true;

        while (loopTerminate) {
            //Main Menu options
            System.out.println("1.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c. = > Press to - > 1");
            System.out.println("2.Вычислить значение выражения по формуле (все переменные принимают действительные значения): = > Press to - > 2");
            System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):");
            System.out.println("4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
                    "Поменять местами дробную и целую части числа и вывести полученное значение числ");
            System.out.println("5.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                    "Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc");
            System.out.println("6. Для данной области составить линейную программу, которая печатает true, " +
                    "если точка с координатами принадлежит закрашенной области, и false — в противном случае");
            System.out.print("7. Exit - >");
            option1 = input.nextInt();

            switch (option1) {

                case 1:
                    // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
                    System.out.println(" Enter value a - >");
                    double a = scanner.nextDouble();
                    System.out.println(" Enter value b - >");
                    double b = scanner.nextDouble();
                    System.out.println(" Enter value c - >");
                    double c = scanner.nextDouble();
                    function11(a, b, c);
                    break;
                case 2:
//                    2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
////                    𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
                    System.out.println(" Enter value a - >");
                    a = scanner.nextDouble();
                    System.out.println(" Enter value b - >");
                    b = scanner.nextDouble();
                    System.out.println(" Enter value c - >");
                    c = scanner.nextDouble();
                    function12(a, b, c);
                    break;
                case 3:
//                    3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//                    𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦∗𝑡
                    System.out.println(" Enter value x - >");
                    double x = scanner.nextDouble();
                    System.out.println(" Enter value y - >");
                    double y = scanner.nextDouble();
                    function13(x, y);
                    break;
                case 4:
//                    4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//                        Поменять местами дробную и целую части числа и вывести полученное значение числа.
                    System.out.println(" Enter value x ( x = 123.456) - >");
                    double x4 = scanner.nextDouble();
                    function14(x4);
                    break;
                case 5:
//                    5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//                    Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//                ННч ММмин SSc.
                    System.out.println(" Enter value t - >");
                    double t = scanner.nextDouble();
                    function15(t);
                    break;
                case 6:
//                    6. Для данной области составить линейную программу, которая печатает true,
//                        если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
                    System.out.println(" Enter value x - >");
                    double x6 = scanner.nextDouble();
                    System.out.println(" Enter value y - >");
                    double y6 = scanner.nextDouble();
                    function16(x6, y6);
                    break;
                case 7:
                    loopTerminate = false;
                    return; //terminate outer menu

                default:
                    System.out.println("Invalid option");
            }
        }

    }

    //////////////=================Линейный программы=====================
    // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
    public static double function11(double a, double b, double c) {
        double z = ((a - 3) * b / 2) + c;
        System.out.print(" z = " + z);
        return z;
    }

    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
    // 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
    public static double function12(double a, double b, double c) {
        double z = (b + Math.sqrt(Math.pow(b, 2)) + 4 * a * c) / 2 * a - Math.pow(a, 3) * 3 + Math.pow(b, -2);
        System.out.print(" z = " + z);
        return z;
    }

    //3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//          𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦
//          𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦∗ 𝑡𝑔 𝑥𝑦
    public static double function13(double x, double y) {
        double z = z = ((Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.print(" z = " + z);
        return z;
    }

    //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
////          дробную и целую части числа и вывести полученное значение числ
    public static double function14(double x) {

//          double x = 123.456 ;
        double r = (x = (int) x / 1000.0 + (x - (int) x) * 1000);
        System.out.println(" R - > " + r);
        return r;
    }

    //          5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//          данное значение длительности в часах, минутах и секундах в следующей форме:
//          ННч ММмин SSc
    public static String function15(double t) {

        int hours = (int) t / (60 * 60);
        int minutes = (int) (t / 60);
        if (hours > 0) {
            minutes = minutes - hours * 60;
        }
        int seconds = (int) t % 60;
        String time = hours + "ч " + minutes + "мин " + seconds + "c";
        System.out.println(time);
        return time;
    }

    //          6. Для данной области составить линейную программу, которая печатает true, если точка с координатами
    //          (х, у)
//          принадлежит закрашенной области, и false — в противном случае
    public static boolean function16(double x, double y) {
        boolean result = false;
        if (-4 < x && x < 4 && -3 < y && y < 0) {
            result = true;
        } else if (-2 < x && x < 2 && 0 < y && y < 4) {
            result = true;
        }

        System.out.println(result);

        return result;
    }
}
