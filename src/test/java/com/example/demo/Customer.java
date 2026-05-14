package com.example.demo;

public class Customer {

    public Customer(String emailAddress, String customerID, String password, Boolean isProMember, int phoneNumber, String name) {
        this.emailAddress = emailAddress;
        this.customerID = customerID;
        this.password = password;
        this.isProMember = isProMember;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    String emailAddress;
    String customerID;
    String password;
    Boolean isProMember;
    int phoneNumber;
    String name;

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){

        return "Welcome to your account" + this.name;
    }



}