package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListOf3Numbers_HT6 {

    public static void main(String[] args) {

//        Игра Jолушка 1.0: распихиваиние чисел по трем спискам.
//        Правила таковы: Jолушка получила список из 20 чисел.
//        Ей нужно проверить, какие из них нацело делятся на 3, какие на 2,
//        а какие — ни на то, ни на другое.
//        Затем ей нужно сохранить их в отдельные списки.
//        Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка. Решаем!

        Random random = new Random();

        List<Integer> originList = new LinkedList<>();

        for (int i = 0; i <= 20; i++) {
            originList.add(i,random.nextInt(100));
        }


        for (int value : originList){
            System.out.print(value + ", ");
        }

        List<Integer> listOf2 = new LinkedList<>();
        List<Integer> listOf3 = new LinkedList<>();
        List<Integer> listOfElse = new LinkedList<>();

        for (int value : originList){
            if(value % 2 == 0 && value % 3 == 0){
                listOf2.add(value);
                listOf3.add(value);
            }
            else if(value % 2 == 0){
                listOf2.add(value);
            }
            else if (value % 3 == 0){
                listOf3.add(value);
            }
            else {
                listOfElse.add(value);
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("results:");

        System.out.println("List of n divide to 2:");
        for (int value : listOf2){
            System.out.print(value + ", ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("List of n divide to 3:");
        for (int value : listOf3){
            System.out.print(value + ", ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("List of n not divide to 2 or 3:");
        for (int value : listOfElse){
            System.out.print(value + ", ");
        }




    }
//
//    private final String print(LinkedList l){
//
//        for (int y=0, y<l.size(), y++) {
//            System.out.println(l);
//        }
//    }
}
