package org.example.abstractfactory;

public class XMLDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Save xml dept dao");
    }
}
