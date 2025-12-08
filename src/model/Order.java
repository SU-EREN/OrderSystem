package model;

public class Order {
    private int orderId;
    private static int counter=1;
    private Customer customer;
    private Product product;
    private int quantity;
    public Order(){

        this.orderId=counter++;
    }
    public int getOrderId(){
        return orderId;
    }
public Customer getCustomer(){
        return customer;
}
public Product getProduct(){
        return product;
}
public int getQuantity(){
        return quantity;
}


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
