package com.bharath.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DaoApplicationTests {

	@Autowired
	EmployeeDAO dao;

	@Test
	public void testCreate() {
		Employee employee = new Employee();
		employee.setId(456);
		employee.setName("BOB");
		dao.create(employee);
	}

}
