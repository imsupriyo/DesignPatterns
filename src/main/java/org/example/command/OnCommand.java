package org.example.command;

public class OnCommand implements Command {

    private final Television television;

    public OnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
