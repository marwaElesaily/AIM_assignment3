package Assignment2;

public class Product {

    private String name;
    private double price;
    private  int quantity;
    private  String category;

    public Product(String name,double price,int quantity, String category ){
        if(price>0){
            this.price=price;
        }else throw new IllegalArgumentException("price can't be negative value........");

        if(quantity>=0){
            this.quantity=quantity;
        }else throw new IllegalArgumentException("quantity can't be negative value........");

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name ........");
        } else this.name=name;

        if (category == null || category.isBlank()){
            throw new IllegalArgumentException("invalid category  ........");
        } else this.category=category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name ........");
        } else this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price=price;
        }else throw new IllegalArgumentException("price can't be negative value........");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity>=0){
            this.quantity=quantity;
        }else throw new IllegalArgumentException("quantity can't be negative value........");

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category == null || category.isBlank()){
            throw new IllegalArgumentException("invalid category  ........");
        } else this.category=category;
    }
    public double getTotal(){
        return price*quantity;
    }

    @Override
    public String toString(){
        return "Product name='" + name
                + "', price=" + price
                + ", quantity=" + quantity
                + ", category='" + category
                + "', total=" + getTotal();
    }

    /*

  A getTotal() method. A toString() override. Test all paths including
invalid inputs.
     */
}
