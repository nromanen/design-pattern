package org.example.caching;

import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Map<String, List<String>> users = Map.of("us", List.of("customer1", "customer2"),
        "en", List.of("customer3", "customer4", "customer5"));

    CustomerService proxy = new CustomerServiceCacheProxy(new CustomerServiceImpl(users));

    proxy.getCustomers("us");
    proxy.getCustomers("us");
    proxy.getCustomers("en");
    proxy.getCustomers("en");
    System.out.println("Access count: " + proxy.getAccessCount());



  }

}
