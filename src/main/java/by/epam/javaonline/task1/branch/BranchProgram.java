package  by.epam.javaonline.task1.branch;

import java.util.Scanner;

public class BranchProgram {

    public static void main(String[] args) {
        //////////////=================Ветвления =====================
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int option1, option2 = 0;
        boolean loopTerminate = true;

        while (loopTerminate) {
            //Main Menu options
            System.out.println("1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник," +
                    " и если да, то будет ли он прямоугольный = > Press to - > 1");
            System.out.println("2. Найти max{min(a, b), min(c, d)} = > Press to - > 2");
            System.out.println("3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). " +
                    "Определить, будут ли они расположены на одной прямой = > Press to - > 3");
            System.out.println("4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича." +
                    "Определить, пройдет ли кирпич через отверстие. = > Press to - > 4");
            System.out.println("5.Вычислить значение функции = > Press to - > 5");
            System.out.print("7. Exit - > ");
            option1 = input.nextInt();

            switch (option1) {

                case 1:
////          1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
////          он прямоугольный
                    System.out.println(" Enter value a - >");
                    double a = scanner.nextDouble();
                    System.out.println(" Enter value b - >");
                    double b = scanner.nextDouble();
                    function21(a, b);
                    break;
                case 2:
                    //// 2. Найти max{min(a, b), min(c, d)}.
                    System.out.println(" Enter value a - >");
                    double a2 = scanner.nextDouble();
                    System.out.println(" Enter value b - >");
                    double b2 = scanner.nextDouble();
                    System.out.println(" Enter value c - >");
                    double c2 = scanner.nextDouble();
                    System.out.println(" Enter value d - >");
                    double d2 = scanner.nextDouble();
                    function22(a2, b2, c2, d2);
                    break;
                case 3:
////3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
                    System.out.println(" Enter coordinates - >");
                    System.out.println(" Point A -> ");
                    System.out.print(" x1 -> ");
                    double x1 = scanner.nextDouble();
                    System.out.print(" y1 -> ");
                    double y1 = scanner.nextDouble();
                    System.out.println("Point B -> ");
                    System.out.print(" x2 -> ");
                    double x2 = scanner.nextDouble();
                    System.out.print(" y2 -> ");
                    double y2 = scanner.nextDouble();
                    System.out.println("Point C -> ");
                    System.out.print(" x3 -> ");
                    double x3 = scanner.nextDouble();
                    System.out.print(" y3 -> ");
                    double y3 = scanner.nextDouble();
                    function23(x1, y1, x2, y2, x3, y3);
                    break;
                case 4:
/////4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
                    // //Определить, пройдет ли кирпич через отверстие.
                    System.out.println(" Enter value A - >");
                    double A = scanner.nextDouble();
                    System.out.println(" Enter value B - >");
                    double B = scanner.nextDouble();
                    System.out.println(" Enter value x - >");
                    double x = scanner.nextDouble();
                    System.out.println(" Enter value y - >");
                    double y = scanner.nextDouble();
                    System.out.println(" Enter value z - >");
                    double z = scanner.nextDouble();
                    function24(A, B, x, y, z);
                    break;
                case 5:
                    ////////5. Вычислить значение функции
                    System.out.println(" Enter value x - >");
                    double x5 = scanner.nextDouble();
                    function25(x5);
                    break;
                case 7:
                    loopTerminate = false;
                    return; //terminate outer menu

                default:
                    System.out.println("Invalid option");
            }
        }

    }
    ///////////////////==============Ветвления===============
//          1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//          он прямоугольный

    public static void function21(double a, double b) {

        if ((a + b) <= 180) {

            System.out.print("Треугольник существует");
            if (a == 90 || b == 90 || (270 - (a + b)) == 90) {
                System.out.println("Треугольник прямоугольный !!!");
            } else {
                System.out.println("Треугольник  не прямоугольный !!!");
            }
        } else {

            System.out.println("Треугольник не существует");
        }
    }

// 2. Найти max{min(a, b), min(c, d)}.

    private static double min(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    private static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double function22(double a, double b, double c, double d) {
        double minAB = min(a, b);
        double minCD = min(c, d);

        double max = max(minAB, minCD);
        String str = "max{min(%.2f, %.2f), min(%.2f, %.2f)}=%.2f";
        System.out.println(String.format(str, a, b, c, d, max));
        return max;
    }
    //3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

    public static boolean function23(double x1, double y1, double x2, double y2, double x3, double y3) {
        boolean result = true;
        if (x1 == x2 && x2 == x3) {

            System.out.println(" Point A,B,C are located on one straight line!!!");

        } else if (y1 == y2 && y2 == y3) {

            System.out.println(" Point A,B,C are located on one straight line!!!");
        } else {
            System.out.println(" Point A,B,C ARE NOT located on one straight line!!!");
            result = false;
        }
        return result;
    }

    /////4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
    // //Определить, пройдет ли кирпич через отверстие.
    public static boolean function24(double A, double B, double x, double y, double z) {
        boolean rezult = true;
        if (A == x && B == z || A == z && B == x) {

            System.out.println(" The bicket pass through the hole!!!");
        } else {

            System.out.println(" The bicket does not pass through the hole!!!");
            rezult = false;
        }
        return rezult;
    }

    ////////5. Вычислить значение функции
    public static void function25(double x) {
        double f = 0;
        if (x <= 3) {
            f = Math.pow(x, 2) - 3 * x + 9;
        } else if (x > 3) {
            f = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(" F - >" + f);
    }
}
