package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

        CustomerService service=new CustomerService();


        Customer newCustomer = CustomerService.register(
                "James",                 // name
                "james@example.com",     // emailAddress
                "0712356789",           // phoneNumber
                "Password1!",            // password
                "CUST001"                // customerID


        );

        Customer newCustomerTwo = CustomerService.register(
                "Dave",                 // name
                "dave@example.com",     // emailAddress
                "071235678121219",           // phoneNumber
                "Password2!",            // password
                "CUST002"                // customerID


        );


        Product p1 = new Product(
                1,                          // int productID
                "Laptop",                   // String name
                "High‑performance laptop",  // String description
                10,                         // int stock
                999.99                      // double price
        );

        Product p2 = new Product(
                2,
                "Wireless Mouse",
                "Ergonomic Bluetooth mouse",
                50,
                19.99
        );

        Product p3 = new Product(
                3,
                "Headphones",
                "Noise‑cancelling over‑ear headphones",
                25,
                149.50
        );



        System.out.println(
                service.login(newCustomer,"james@example.com", "Password1!"));


        System.out.println(
                service.login(newCustomerTwo,"james@example.com", "Passord1!")
        );

        System.out.println(p3.stock);
        p3.updateStock(50);
        System.out.println(p3.stock);
	}



}
