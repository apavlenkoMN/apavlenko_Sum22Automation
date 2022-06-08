package session3;

import java.util.Scanner;

public class CheckOddEven_HT3 {

    //cycles, IF SWITCH, TERNARY

    public static void main(String[] args) {


//        1.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number”
//        если переменная “number” типа int нечетная. Или “Even Number” если переменная
//        четная. Программа всегда должна перед выходом печатать “BYE”
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number: ");
        int number = scanner.nextInt();

        if (number%2==0){
            System.out.println(number + " is Even Number");
        }
        else if (number%2==1) {
            System.out.println(number + " Odd Number");
        }

        System.out.println("BYE");
    }

}
