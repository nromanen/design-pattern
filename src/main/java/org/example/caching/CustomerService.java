package org.example.caching;

import java.util.List;

public interface CustomerService {

  List<String> getCustomers(String country);

  int getAccessCount();

}
