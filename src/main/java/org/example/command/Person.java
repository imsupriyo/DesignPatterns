package org.example.command;

public class Person {
    public static void main(String[] args) {
        OnCommand onCommand = new OnCommand(new Television());
        RemoteControl remoteControl = new RemoteControl(onCommand);
        remoteControl.PressButton();
    }
}
