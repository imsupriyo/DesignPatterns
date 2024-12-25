package org.example.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{
    @Override
    Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("dept")) {
            dao = new XMLDeptDao();
        } else {
            dao = new XMLEmpDao();
        }
        return dao;
    }
}
