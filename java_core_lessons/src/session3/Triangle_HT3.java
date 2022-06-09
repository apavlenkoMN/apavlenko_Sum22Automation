package session3;

import java.util.Scanner;

public class Triangle_HT3 {

    //cycles, IF SWITCH, TERNARY

    public static void main(String[] args) {

//        4.Написать программу, которая определяет, является ли треугольник со сторонами a, b, c равнобедренным.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 sides of triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        if (side1 == side2 || side1 == side3 || side2 == side3 ){
            System.out.println("triangle is isosceles, two sides are equal");
        }
        else {
            System.out.println("trianle is not isosceles, all sides are different");
        }



    }

}
