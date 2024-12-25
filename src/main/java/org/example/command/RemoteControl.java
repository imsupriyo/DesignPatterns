package org.example.command;

public class RemoteControl {
    private final Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void PressButton() {
        command.execute();
    }
}
