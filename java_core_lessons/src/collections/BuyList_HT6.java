package collections;

import java.util.*;


public class BuyList_HT6 {


//    Создать программу - список покупок. В этот список заносятся объекты типа Product,
//    у которого есть поля name, quantity, price.
//    Написать программу, которая выводит полный список покупок на экран
//    (название - количество - общая стоимость).
//    Вывести список 2 раза: отсортированный по названию продуктов, и по общей стоимости.

    public static void main(String[] args) {

        Random random = new Random();

        Product product1 = new Product("Prod1", random.nextInt(100), 23);
        Product product2 = new Product("Prod2", random.nextInt(100), 63.41);
        Product product3 = new Product("Prod3", random.nextInt(100), 13.05);


        List<Product> buyList = new LinkedList<>(Arrays.asList(new Product("Product5", 3, 22.12), new Product("Product6", 23, 12.12), new Product("Product7", 5, 42.12), new Product("Product2", 1, 2.12)));

        buyList.add(product1);
        buyList.add(product2);
        buyList.add(product3);

        System.out.println("original: " + buyList);

        Collections.sort(buyList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getTotalCost() - o1.getTotalCost();
            }
        });

        System.out.println("sort by Total Cost: " + buyList);


        Collections.sort(buyList, Comparator.comparing(obj -> obj.getName()));

        System.out.println("sort by name: " + buyList);


    }


}
