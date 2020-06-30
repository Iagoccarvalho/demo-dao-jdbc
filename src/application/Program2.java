package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1: insert Department ===");
		depDao.insert(new Department(null, "RH"));
		
		System.out.println("=== Test 2: update Department ===");
		depDao.update(new Department(8, "Dep"));
		System.out.println("Updated");
		
		System.out.println("=== Test 3: deleteById Department ===");
		depDao.deleteById(15);
		System.out.println("Deleted");
		
		System.out.println("=== Test 4: finById Department ===");
		Department dep1 = depDao.findById(1);
		System.out.println(dep1);
		
		System.out.println("=== Test 5: findAll Department ===");
		List<Department> list = depDao.findAll();
		
		for(Department dep : list) {
			System.out.println(dep);
		}

	}

}
