package org.example.abstractfactory;

public class XMLEmpDao implements Dao{
    @Override
    public void save() {
        System.out.println("Save XMLEmpDao");
    }
}