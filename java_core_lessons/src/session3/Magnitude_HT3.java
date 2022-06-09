package session3;

import java.util.Scanner;

public class Magnitude_HT3 {

    //cycles, IF SWITCH, TERNARY

    public static void main(String[] args) {


//        3.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
//        Например, если одно число = 3, а второе число = -9, программа должна выдать, что
//        число -9 имеет большую величину. Для вычисления абсолютного значения можно использовать метод из стандартной библиотеки Math.abs()


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
//        int number1 = Math.abs(scanner.nextInt());
//        int number2 = Math.abs(scanner.nextInt());
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (Math.abs(number1) > Math.abs(number2) ){
            System.out.println(number1 + " is bigger than " + number2 );
        }
        else if (Math.abs(number1) < Math.abs(number2)){
            System.out.println(number1 + " is less than " + number2 );
        }
        else {
            System.out.println(number1 + " and " + number2 + " are equal");
        }

        //конечно если мы хотим выводить оригинальные числа, а не абсолютные,
        // надо хранить number1 и number2 без изменений, а после в проверках их приводить в abs



    }

}
