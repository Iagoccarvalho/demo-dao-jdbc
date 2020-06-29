package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== Test 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n=== Test 2: seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
		
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== Test 3: seller findAll ===");
		list = sellerDao.findAll();
		
		for(Seller sel : list) {
			System.out.println(sel);
		}
		
		System.out.println("\n=== Test 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, 
				new Department(2, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " +newSeller.getId());
		

	}

}
