package com.example.demo;

public class Customer {

    String name;
    String emailAddress;
    String phoneNumber;
    String password;
    String customerID;
    Boolean isProMember = false;

    public Customer(String name, String emailAddress, String phoneNumber, String password, String customerID, Boolean isProMember ) {

        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getProMember() {
        return isProMember;
    }

    public void setProMember(Boolean proMember) {
        isProMember = proMember;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
if (endsInS(name)){

    return "Welcome to "+ this.name+ "' account";
}
        return "Welcome to "+ this.name+ "'s account";
    }

    public boolean endsInS (String name){

        if(name.charAt(name.length()-1)=='s'){

            return true;
        }
        return false;
    }

    public Customer register(String name,String emailAddress,String phoneNumber,String password, String customerID){

        if(name==null||name.isEmpty()){

            throw new RuntimeException("name cannot be empty");
        }

        else if(emailAddress==null||emailAddress.isEmpty()){

            throw new RuntimeException("email cannot be empty");
        }

        else if(phoneNumber==null||phoneNumber.isEmpty()){

            throw new RuntimeException("phone number cannot be empty");
        }

        else if (password == null || password.isEmpty()) {
            throw new RuntimeException("password cannot be empty");
        }

        else if (password.length() < 8) {
            throw new RuntimeException("password must be at least 8 characters long");
        }

        else if (!password.matches(".*[A-Z].*")) {
            throw new RuntimeException("password must contain at least one uppercase letter");
        }

        else if (!password.matches(".*[a-z].*")) {
            throw new RuntimeException("password must contain at least one lowercase letter");
        }

        else if (!password.matches(".*\\d.*")) {
            throw new RuntimeException("password must contain at least one number");
        }

        else if (!password.matches(".*[!@#$%^&*().,?].*")) {
            throw new RuntimeException("password must contain at least one special character");
        }

        else if(customerID==null||customerID.isEmpty()){

            throw new RuntimeException("customer ID  cannot be empty");
        }

        Customer newCustomer = new Customer(name,emailAddress,phoneNumber,password,customerID,isProMember);
        return newCustomer;

    }

}