package org.example.counter;

public class CustomerImpl implements Customer {
  private String firstName;
  private String lastName;

  public CustomerImpl(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public void printFullName( ) {
    System.out.println(this.firstName + " " +this.lastName);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
}