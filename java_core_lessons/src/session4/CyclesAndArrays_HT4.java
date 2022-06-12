package session4;

import java.util.Arrays;
import java.util.Random;

public class CyclesAndArrays_HT4 {

    public static void main(String[] args) {

        System.out.println("Part1:");
        System.out.println(" ");
        //part1
//        1 Написать программу, которая печатает таблицу значений sin(x),
//        где x это каждые 10 градусов от 0 до 360


        int step = 10; //чтоб иметь возможность менять шаг градусов
        int total = 360;
        int j = 0;
        double [] tableOfSine = new double [(total/step)+1];

        for (int i=0;i<=total/step;i++){
//            tableOfSin[i] = Math.sin(j);   простой math.sin выдавал негативные числа, совсем не по таблице синусов
            tableOfSine[i] = Math.sin(j * Math.PI / 180);
            System.out.println("syn(" + j + ") = " + tableOfSine[i]);
            j = j+step;
        }


        System.out.println("---");
        System.out.println("Part2:");
        System.out.println(" ");
        //part2

//        2 Написать программу, которая в массиве из случайных чисел заменяет все чётные числа на 0
//        и выводит полученный массив на экран.
//        Для генерации случайных чисел можно использовать Random:
//        Random random = new Random;
//
//        int i = random.nextInt(100); //случайное целое число до 100

        Random random = new Random();
        int arrLen = 20;
        int [] randArray = new int [arrLen];

        for (int i=0;i<randArray.length;i++){ //возможно нужно было сначала заполнить массив циклом, а вторым циклом проставить 0
            randArray[i] = random.nextInt(100);
            if(randArray[i]%2==0){
                randArray[i]=0;
            }
            //System.out.println("element"+ i +" with value " + randArray[i]);
        }
        System.out.println(Arrays.toString(randArray));

        System.out.println("---");
        System.out.println("Part3:");
        System.out.println(" ");
        //part3
//        3 Написать программу, которая считает
//        среднее арифметическое всех элементов в массиве из 10 случайных чисел.

        int arrLen2 = 10;
        int [] randArray2 = new int [arrLen2];
        int sum = 0;

        for (int i=0;i<randArray2.length;i++){
            randArray2[i] = random.nextInt(100);
            //System.out.println("element"+ i +" with value " + randArray2[i]);

            sum = sum + randArray2[i];
        }
        System.out.println(Arrays.toString(randArray2));
        System.out.println("sum of all elements is " + sum + " and " + arrLen2 + " is n of elements");
        System.out.println("average is " + sum/randArray2.length);




    }

}
