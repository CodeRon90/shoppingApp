package com.example.demo;

import java.util.Objects;

public class CustomerService {

    public static Customer register(String name,String emailAddress,String phoneNumber,String password, String customerID){

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

        Customer newCustomer = new Customer(name,emailAddress,phoneNumber,password,customerID);
        System.out.println("Thank you for registering "+ name);
        return newCustomer;

    }

        public String login(Customer customer, String emailAttempt, String passwordAttempt) {

            boolean emailMatches = customer.getEmailAddress().equals(emailAttempt);
            boolean passwordMatches = customer.getPassword().equals(passwordAttempt);

            if (!emailMatches || !passwordMatches) {
                return "incorrect email or password, please try again";
            }

            return "login successful";
        }



}
