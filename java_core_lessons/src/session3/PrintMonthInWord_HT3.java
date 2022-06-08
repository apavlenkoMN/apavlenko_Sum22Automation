package session3;

import java.util.Scanner;

public class PrintMonthInWord_HT3 {

    //cycles, IF SWITCH, TERNARY

    public static void main(String[] args) {


//        2.Написать программу с названием “PrintMonthInWord”, которая печатает “JAN”,
//“FEB”, …. “DEC”, если переменная “month” типа int будет 1, 2, 3, 4 … 12.. В
//        противном случае программа должна вывести “Not a valid month”. Решить задачу двумя
//        способами:
//        1) с использованием if..else if
//        2) с использованием switch-case


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter month number (1-12): ");
        int month = scanner.nextInt();


        //WAY 1
        if (month == 1){
            System.out.println("JAN");
        }
        else if (month == 2) {
            System.out.println("FEB");
        }
        else if (month == 3) {
            System.out.println("MAR");
        }
        else if (month == 4) {
            System.out.println("APR");
        }
        else if (month == 5) {
            System.out.println("MAY");
        }
        else if (month == 6) {
            System.out.println("JUN");
        }
        else if (month == 7) {
            System.out.println("JUL");
        }
        else if (month == 8) {
            System.out.println("AUG");
        }
        else if (month == 9) {
            System.out.println("SEP");
        }
        else if (month == 10) {
            System.out.println("OCT");
        }
        else if (month == 11) {
            System.out.println("NOV");
        }
        else if (month == 12) {
            System.out.println("DEC");
        }
        else {
            System.out.println("Not a valid month. please enter correct number from 1 to 12");
        }


        // WAY 2
        switch (month){
        case 1:
            System.out.println("JAN");
            break;
        case 2:
            System.out.println("FEB");
            break;
        case 3:
            System.out.println("MAR");
            break;
        case 4:
            System.out.println("APR");
            break;
        case 5:
            System.out.println("MAY");
            break;
        case 6:
            System.out.println("JUN");
            break;
        case 7:
            System.out.println("JUL");
            break;
        case 8:
            System.out.println("AUG");
            break;
        case 9:
            System.out.println("SEP");
            break;
        case 10:
            System.out.println("OCT");
            break;
        case 11:
            System.out.println("NOV");
            break;
        case 12:
            System.out.println("DEC");
            break;
        default:
            System.out.println("Not a valid month. Please enter correct number from 1 to 12");
        }


        // way 3
        String[] monthArr = {"not a month", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        if (month >0 && month <=12){
            System.out.println(monthArr[month]);
        }
        else {
            System.out.println("Not a valid month. Please enter correct number from 1 to 12");
        }


    }

}
