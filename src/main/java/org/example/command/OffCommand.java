package org.example.command;

public class OffCommand implements Command {
    private final Television television;

    public OffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
