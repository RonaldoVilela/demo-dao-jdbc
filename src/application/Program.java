package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(6);

		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByIDepartment ===");
		Department dep = new Department(2,null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		
		sellers.forEach(x -> System.out.println(x));
		
		System.out.println("\n=== TEST 2: seller findByIDepartment ===");
		sellers = sellerDao.findAll();
		
		sellers.forEach(x -> System.out.println(x));

	}

}
