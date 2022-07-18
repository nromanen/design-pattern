package org.example.counter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DemoDynamicProxy {

  public static void main(final String[] args) {
    Customer proxy = CustomerClassFactory.getDynamicSomeClassProxy(new CustomerImpl("Dynamic", "Proxy"));
    proxy.printFullName();
    proxy.printFullName();
    proxy.printFullName();

    InvocationHandler handler = Proxy.getInvocationHandler(proxy);
    System.out.println("Dynamic class name " + proxy.getClass().getSimpleName());
    System.out.println("Counter from handler = " + ((MethodInvocationCountHandler) handler).getInvocationCount());

    System.out.println();

    Customer staticProxy = CustomerClassFactory.getProxy(new CustomerImpl("Static", "Proxy"));
    System.out.println("static class name " + staticProxy.getClass().getSimpleName());

    staticProxy.printFullName();
    staticProxy.printFullName();


    Customer staticProxy1 = CustomerClassFactory.getProxy(new CustomerImpl("Stat", "Proxy"));

    staticProxy1.printFullName();
    staticProxy1.printFullName();

  }
}