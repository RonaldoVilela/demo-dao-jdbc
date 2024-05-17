package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== test 1 : findById ===");
		Department dep = departmentDao.findById(8);
		System.out.println(dep);
		
		System.out.println("\n=== test 2 : findAll ===");
		List<Department> departments = departmentDao.findAll();
		departments.forEach(x -> System.out.println(x));
		
		System.out.println("\n=== test 3 : deleteById ===");
		departmentDao.deleteById(11);
		System.out.println("Deleted!");
		
		System.out.println("\n=== test 4 : insert ===");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("new Id = "+newDep.getId());
		
		System.out.println("\n=== test 5 : update ===");
		dep.setName("Science");
		departmentDao.update(dep);
		System.out.println("UPDATED");
		

	}

}
