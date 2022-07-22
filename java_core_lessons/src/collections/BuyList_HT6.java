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

        Product_HT6 product1 = new Product_HT6("Prod1", random.nextInt(100), 23);
        Product_HT6 product2 = new Product_HT6("Prod2", random.nextInt(100), 63.41);
        Product_HT6 product3 = new Product_HT6("Prod3", random.nextInt(100), 13.05);


        List<Product_HT6> buyList = new LinkedList<>(Arrays.asList(new Product_HT6("Product5", 3, 22.12), new Product_HT6("Product6", 23, 12.12), new Product_HT6("Product7", 5, 42.12), new Product_HT6("Product2", 1, 2.12)));

        buyList.add(product1);
        buyList.add(product2);
        buyList.add(product3);

        System.out.println("original: " + buyList);

        Collections.sort(buyList, new Comparator<Product_HT6>() {
            @Override
            public int compare(Product_HT6 o1, Product_HT6 o2) {
                return o2.getTotalCost() - o1.getTotalCost();
            }
        });

        System.out.println("sort by Total Cost: " + buyList);


        Collections.sort(buyList, Comparator.comparing(obj -> obj.getName()));

        System.out.println("sort by name: " + buyList);


    }


}
