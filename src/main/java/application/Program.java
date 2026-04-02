package application;

import dao.DaoFactory;
import dao.SellerDao;
import daoImplementations.SellerDaoImpl;
import model.Department;
import model.Seller;


import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== Test 1: Find Seller by ID ===");
        Seller seller = sellerDao.findById(6);
        System.out.println(seller);

        System.out.println("=== Test 2: Find Seller by Department ID ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        sellers.forEach(System.out::println);

        System.out.println("=== Test 3: Find All===");
        Department dep = new Department(2, null);
        List<Seller> vendedores = sellerDao.findAll();
        vendedores.forEach(System.out::println);

        System.out.println("=== Test 4: Seller Insert===");
        Seller seller2 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000, department);
        sellerDao.insert(seller2);
        System.out.println("INSERTED SUCCESSFULLY, New ID = " + seller2.getId());
    }
}
