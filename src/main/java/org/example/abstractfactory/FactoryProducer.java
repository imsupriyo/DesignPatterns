package org.example.abstractfactory;

public class FactoryProducer {
    public static DaoAbstractFactory produce(String type) {
        DaoAbstractFactory factory = null;
        if (type.equals("xml")) {
            factory = new XMLDaoFactory();
        } else {
            factory = new DBDaoFactory();
        }
        return factory;
    }
}
