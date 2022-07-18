package org.example.controller;


import org.example.command.Command;

public class Controller {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }
}
