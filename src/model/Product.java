package model;

public class Product {
    private String name;
    private float price;
    private int stock;
    private String category;
    private int id;
    private static int counter=1;

     public Product(){
         this.id=counter++;

     }
     public String getName(){
         return name;
     }
public float getPrice(){
         return price;
}
public int getStock(){
         return stock;
}
public String getCategory(){
         return category;
}
public void setName(String name){
         this.name=name;
}
public void setPrice(float price){
         this.price=price;
}
public void setStock(int stock){
         this.stock=stock;
}
public void setCategory(String category){
         this.category=category;
}

}
