package dao;

import daoImplementations.SellerDaoImpl;
import db.DB;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoImpl(DB.getConnection());
    }
}
