package org.example.counter;

import java.lang.reflect.Proxy;

public class CustomerClassFactory {

  public static Customer getDynamicSomeClassProxy(Customer customer) {
    return (Customer) Proxy.newProxyInstance(
        CustomerClassFactory.class.getClassLoader(),
        new Class[]{Customer.class},
        new MethodInvocationCountHandler(customer));
  }

  public static CustomerProxy getProxy(Customer customer) {
    CustomerImpl cus = (CustomerImpl) customer;
    return new CustomerProxy(cus);
  }

}
