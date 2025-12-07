package model;

public class Customer {
    private String customerFirstName;
    private String customerLastName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;
    private int customerId;
    private static int counter=1;
    public Customer(){
        this.customerId=counter++;
    }
    public String getCustomerFirstName(){
        return customerFirstName;
    }
    public String getCustomerLastName(){
        return customerLastName;
    }
    public String getCustomerAddress(){
        return customerAddress;
    }
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }
    public String getCustomerEmail(){
        return customerEmail;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerFirstName(String customerFirstName){
        this.customerFirstName=customerFirstName;
    }
    public void setCustomerLastName(String customerLastName){
        this.customerLastName=customerLastName;
    }
    public void setCustomerAddress(String customerAddress){
        this.customerAddress=customerAddress;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber=customerPhoneNumber;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail=customerEmail;
    }

}
