package session2;

import java.util.Scanner;

public class TemperatureTriangleRadius_HT2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Celsius = 5/9 (F - 32)
//        Kelvin = C + 273.16
//        Вывод должен быть примерно такой: C: F; K,
//        где X - исходное значение в градусах Цельсия, Y и Z - вычисленные значения в Фаренгейтах и Кельвинах соответственно.

        System.out.println("---");
        System.out.println("task1:");


        System.out.print("enter C value: ");
        int c = scanner.nextInt();
        int f = (c * 9/5) + 32;
        double k = c + 273.16;
        System.out.println("C(celsius): "+ c + "; F(fahrenheit): " + f + "; K(kelvin): " + k);



//        2. Написать программу, которая выводит площадь прямоугольного треугольника.
//        Значения катетов задать через переменные

        System.out.println("---");
        System.out.println("task2:");
        System.out.print("enter leg1: ");
        int leg1 = (int) scanner.nextFloat();
        System.out.print("enter leg2: ");
        int leg2 = (int) scanner.nextFloat();
        System.out.println("area of triangle is " + (leg1*leg2)/2 );


//        3 Написать программу, которая вычисляет площадь круга.

        System.out.println("---");
        System.out.println("task3:");
        System.out.print("enter radius of circle: ");
        //int rad = (int) scanner.nextFloat();
        double rad= scanner.nextDouble();
        double S = Math.PI * Math.pow(rad,2);
        System.out.printf("area of circle is " + String.format("%.2f", S) );

    }


}
