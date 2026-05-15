package com.example.demo;

import java.util.Objects;

public class Customer {

    private String name;
    private String emailAddress;
    private String phoneNumber;
    private String password;
    private String customerID;
    private Boolean isProMember = false;

    public Customer(String name, String emailAddress, String phoneNumber, String password, String customerID ) {

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



}