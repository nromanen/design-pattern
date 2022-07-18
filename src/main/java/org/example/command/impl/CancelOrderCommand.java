package org.example.command.impl;


import org.example.command.Command;
import org.example.shop.Order;

public class CancelOrderCommand implements Command {

    Order order;

    public CancelOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Canceling the order...");
        order.cancelOrder();
    }
}
