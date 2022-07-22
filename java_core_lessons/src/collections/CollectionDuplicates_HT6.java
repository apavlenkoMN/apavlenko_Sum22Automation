package collections;

import java.util.*;

public class CollectionDuplicates_HT6 {

//    Написать программу, которая удаляет из коллекции все дубликаты, если они есть.
//    Вывести обе коллекции на экран и количество удалённых дубликатов.
//* Задачу можно решить несколькими способами,
// для каждого из способов нужно замерить время, в конце - сравнить какой метод быстрее.


    public static void main(String[] args) {


        Random random = new Random();

        List<Integer> collectionDuplicate = new LinkedList<>();
        List<Integer> deletedItems = new LinkedList<>();
        int count = 0;

        for(int i = 0; i<100; i++){
            collectionDuplicate.add(random.nextInt(100));
        }

        System.out.println("size of original " + collectionDuplicate.size());
        System.out.println("size of deleted " + deletedItems.size());

        System.out.println("original: " + collectionDuplicate);

        for(int i = 0; i<collectionDuplicate.size(); i++){
            for(int y = 0; y<collectionDuplicate.size(); y++)
            if (collectionDuplicate.get(i).equals(collectionDuplicate.get(y))){
                deletedItems.add(collectionDuplicate.get(i));
                collectionDuplicate.remove(i);
                count++;
            }
        }


        System.out.println("size of original " + collectionDuplicate.size());
        System.out.println("size of deleted " + deletedItems.size());
        System.out.println("count is " + count);
        System.out.println("after: " + collectionDuplicate);
        System.out.println("after: " + deletedItems);


    }


}
