package dao;

import daoImplementations.SellerDaoImpl;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoImpl();
    }
}
