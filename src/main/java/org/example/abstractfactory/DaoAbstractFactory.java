package org.example.abstractfactory;

public abstract class DaoAbstractFactory {
    abstract Dao createDao(String type);
}
