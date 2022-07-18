package org.example.command.impl;

import org.example.command.Command;
import org.example.shop.Bucket;

public class RemoveBucketCommand implements Command {

    Bucket bucket;

    public RemoveBucketCommand(Bucket bucket) {
        this.bucket = bucket;
    }

    @Override
    public void execute() {
        System.out.println("Deleted item from the bucket...");
        bucket.removeFromBucket();
    }
}
