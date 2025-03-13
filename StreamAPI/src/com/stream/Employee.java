package com.stream;

import java.util.*;

final class Employee {

	private final String id;
	private final String name;
	private final List<String> departments;

	public Employee(String id, String name, List<String> departments) {
		this.id = id;
		this.name = name;
		this.departments = departments;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name,departments);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj) return true;
		if((obj == null) || getClass() !=obj.getClass()) return false;
		Employee employee = (Employee) obj;
	//	return id == employee.id && employee.name && employee.departments;
		return super.equals(obj);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("IT");
		list.add("Sales");
		Employee employee = new Employee("1ADDGDJD", "ABC", list);
		Employee employee1 = new Employee("1ADDGDJD", "ABC", list);
		
		Map<Employee, String> map1 = new HashMap<Employee, String>();
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "ABC");
		map.put(40, "ABC");
		map.put(10, "ABC");
		
		System.out.println("Map" + map);
		System.out.println(
				"Employee: " + employee.getId() + ", " + employee.getName() + ", " + employee.getDepartments());
	
		map1.put(employee, "null");
		map1.put(employee1, "null");
		
		map1.put(employee, "null");
		map1.put(employee1, "null");
		
		
		
		System.out.println("Map" + map1);
		
		employee.getDepartments().add("Admin");
		
		System.out.println(
				"Employee: " + employee.getId() + ", " + employee.getName() + ", " + employee.getDepartments());
		
	    
		
	}

	
}
