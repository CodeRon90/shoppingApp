package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

        Customer newCustomer = Customer.register(
                "James",                 // name
                "james@example.com",     // emailAddress
                "0712356789",           // phoneNumber
                "Password1!",            // password
                "CUST001"                // customerID
        );

	}


}
