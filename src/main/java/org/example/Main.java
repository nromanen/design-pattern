package org.example;


import org.example.command.impl.AddBucketCommand;
import org.example.command.impl.CancelOrderCommand;
import org.example.command.impl.CreateOrderCommand;
import org.example.command.impl.RemoveBucketCommand;
import org.example.controller.Controller;
import org.example.shop.Bucket;
import org.example.shop.Order;

public class Main {

    public static void main(String[] args) {

        Bucket bucket1 = new Bucket();
        Bucket bucket2 = new Bucket();

        Order order1 = new Order();
        Order order2 = new Order();

        Controller controller = new Controller();

        controller.setCommand(new AddBucketCommand(bucket1));
        controller.runCommand();

        controller.setCommand(new RemoveBucketCommand(bucket2));
        controller.runCommand();

        controller.setCommand(new CreateOrderCommand(order1));
        controller.runCommand();

        controller.setCommand(new CancelOrderCommand(order2));
        controller.runCommand();
    }

}
