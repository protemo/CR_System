package com.CompuRed;

import com.CompuRed.Store.Service;
import com.CompuRed.Store.Customer;

public class Main {

    public static void main(String[] args)
    {
        String n1 = "Luis";

        Customer c1 = new Customer(n1, "Gomez");

        Service s1 = new Service(c1);



        System.out.println(s1.customer.getName());

        c1.setName("Not Luis");

        System.out.println(s1.customer.getName());

       n1 = "ASDASD";

        System.out.println(s1.customer.getName());

    }
}
