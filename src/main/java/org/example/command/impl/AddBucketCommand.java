package org.example.command.impl;


import org.example.command.Command;
import org.example.shop.Bucket;

public class AddBucketCommand implements Command {

    Bucket bucket;

    public AddBucketCommand(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void execute() {
        System.out.println("Adding item to the bucket...");
        bucket.addToBucket();
    }
}
