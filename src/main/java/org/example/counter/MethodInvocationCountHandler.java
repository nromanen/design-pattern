package org.example.counter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvocationCountHandler implements InvocationHandler {

  private int invocationCount = 0;
  private final Object implementation;

  public MethodInvocationCountHandler(final Object implementation) {
    this.implementation = implementation;
  }

  public int getInvocationCount( ) {
    return invocationCount;
  }

  public Object invoke(Object proxy, Method meth, Object[] args)
      throws Throwable {
    try {
      this.invocationCount++;

      Object result = meth.invoke(implementation, args);
      System.out.println(this.invocationCount);
      return result;
    } catch (final InvocationTargetException ex) {
      throw ex.getTargetException( );
    }
  }
}
