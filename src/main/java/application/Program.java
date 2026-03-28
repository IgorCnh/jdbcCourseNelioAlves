package application;

import dao.DaoFactory;
import dao.SellerDao;
import daoImplementations.SellerDaoImpl;
import model.Department;
import model.Seller;


import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(8);
        System.out.println(seller);
    }
}
