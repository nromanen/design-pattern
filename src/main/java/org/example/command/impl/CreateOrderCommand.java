package org.example.command.impl;


import org.example.command.Command;
import org.example.shop.Order;

public class CreateOrderCommand implements Command {

    Order order;

    public CreateOrderCommand(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Creating the order...");
        order.createOrder();
    }
}
