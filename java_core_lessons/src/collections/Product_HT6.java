package collections;

public class Product_HT6 {

    private int quantity;
    private String name;
    private double price;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCost(){
        return this.quantity * (int)this.price;
    }


    public Product_HT6(String name, int quantity, double price){
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

//    @Override
//    public String toString() {
//        return "Product {" +
//                "quantity=" + quantity +
//                ", name='" + name + '\'' +
//                ", price=" + price +
//                '}';
//    }

    @Override
    public String toString() {
        return "{" + name  +
                " , quantity = " + quantity +
                ", price = " + price +
                '}';
    }

    public void printProduct(Product_HT6 p){
        System.out.print(p.getName() + " - ");
        System.out.print(p.getQuantity() + " - ");
        System.out.print(p.getPrice());
        System.out.println();
    }



}
