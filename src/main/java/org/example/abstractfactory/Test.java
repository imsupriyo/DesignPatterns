package org.example.abstractfactory;

public class Test {
    public static void main(String[] args) {
        FactoryProducer.produce("xml").createDao("emp").save();
        FactoryProducer.produce("db").createDao("dept").save();
    }
}
