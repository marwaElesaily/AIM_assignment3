package Assignment2;

public class Main2 {
    public static void main(String[] args) {

        Product product1=new Product("laptop",15.500,2,"electronic");

        System.out.println("total price = "+product1.getTotal());

        System.out.println(product1.toString());
    }
}
