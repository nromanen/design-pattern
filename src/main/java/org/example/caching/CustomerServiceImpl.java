package org.example.caching;

import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

  private final Map<String, List<String>> customers;
  private int count;

  public CustomerServiceImpl(Map<String, List<String>> customers) {
    this.customers = customers;
  }

  @Override
  public List<String> getCustomers(String country) {
    count++;
    return customers.get(country);
  }

  @Override
  public int getAccessCount() {
    return count;
  }
}
