package org.example.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{
    @Override
    Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("dept")) {
            dao = new DBDeptDao();
        } else {
            dao = new DBEmpDao();
        }
        return dao;
    }
}
