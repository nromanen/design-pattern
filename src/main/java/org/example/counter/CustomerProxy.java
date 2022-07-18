package org.example.counter;

public class CustomerProxy implements Customer {
  private final CustomerImpl customerImpl;
  private int invocationCount = 0;

  public CustomerProxy(CustomerImpl customerImpl) {
    this.customerImpl = customerImpl;
  }

  public void printFullName( ) {
    if( customerImpl.getFirstName().equals("Static")){
      invocationCount++;
      this.customerImpl.printFullName( );
    }
    System.out.println(invocationCount);
  }

}
