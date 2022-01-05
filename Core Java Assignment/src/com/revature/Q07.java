package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q07 {
	
	public class Employee implements Comparator<Employee> {
		String name, department;
		Integer age; // This is called a "Wrapper class" - it wraps a primitive and provides extra functionality
		
		public int compare(Employee employee, Employee otherEmployee) {
			if (employee.name == otherEmployee.name) {
				// Sort on other attributes
				if (employee.department == otherEmployee.department) {
					// Sort by age
					return employee.age.compareTo(otherEmployee.age);
				} else {
					return employee.department.compareTo(otherEmployee.department);
				}
			} else {
				return employee.name.compareTo(otherEmployee.name);
			}
		}
		
		public String toString() {
			return name + ", " + department + ", " + age + ".";
		}
	}

	public void Compare() {
		
		Employee john = new Employee();
		john.name = "John";
		john.department = "Accounting";
		john.age = 40;
		
		Employee tim = new Employee();
		tim.name = "Tim";
		tim.department = "Accounting";
		tim.age = 47;
		
		Employee john2 = new Employee();
		john2.name = "John";
		john2.department = "Accounting";
		john2.age = 39;
		
		Employee tim2 = new Employee();
		tim2.name = "Tim";
		tim2.department = "Sales";
		tim2.age = 38;
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(john); 
		employees.add(tim); 
		employees.add(john2); 
		employees.add(tim2);
		
		// Collections.sort takes two arguments: the list to sort, and an instance of a comparator that can compare the objects in the list
		// In my case, the objects in the list were all also comparators. 
		Collections.sort(employees, new Employee());
		
		for (int i = 0; i < employees.size(); ++i) {
			System.out.println(employees.get(i).toString());
		}
	}
}
