package org.example.caching;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceCacheProxy implements CustomerService {

  private final CustomerServiceImpl customerService;

  private final Map<String, List<String>> cache = new HashMap<>();

  public CustomerServiceCacheProxy(CustomerServiceImpl customerService) {
    this.customerService = customerService;
  }

  @Override
  public List<String> getCustomers(String country) {
    cache.computeIfAbsent(country, customerService::getCustomers);
    return cache.get(country);
  }

  @Override
  public int getAccessCount() {
    return customerService.getAccessCount();
  }

}
