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
        int size = 35;

        for(int i = 0; i<size; i++){
            collectionDuplicate.add(random.nextInt(size));
        }

//        System.out.println("initial size of original " + collectionDuplicate.size());
//        System.out.println("initial size of deleted " + deletedItems.size());

        System.out.println("original list: " + collectionDuplicate);

        for(int i = 0; i<collectionDuplicate.size(); i++){
            for(int y = 0; y<collectionDuplicate.size(); y++)
            if (collectionDuplicate.get(i).equals(collectionDuplicate.get(y))){
                deletedItems.add(collectionDuplicate.get(i));
                collectionDuplicate.remove(i);
                count++;
            }
        }


//        System.out.println("size of processed list " + collectionDuplicate.size());
//        System.out.println("size of deleted items list " + deletedItems.size());
        System.out.println("count of duplicated items is " + count);
        System.out.println("processed list: " + collectionDuplicate);
        System.out.println("list of deleted items: " + deletedItems);


    }


}
