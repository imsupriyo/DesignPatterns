package org.example.singleton;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(SingletonDemo.INSTANCE.getName());
        SingletonDemo.INSTANCE.setName("Supriyo");
        System.out.println(SingletonDemo.INSTANCE.getName());
    }
}
