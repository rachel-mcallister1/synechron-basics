package com.synechron.basics.array;

public class EmployeeService {
	
	private Employee employees[] = new Employee[10]; // to create self growable array.
	
	private static int count = -1;
	// only 1 & centralized copy.

	public String addEmployee(Employee employee) {
		
		// 1. if array is full then it should increase the size 
		// automatically
		// 2. it should not allow a null employee details.
		
		if(employee!=null) {
			count++;
			
			if(count<employees.length) {
				// allow to add it
				// count  = count + 1
				// count = -1 + 1 
				// count = 0 
				// array index begins with 0.
				
				employees[count] = employee;
				return "success";
			}
			else {
				System.out.println("size increased");
				// we should increase the size of the array.
				Employee temp[] = new Employee[employees.length*2];
				
				// do we need to copy the content from employees to new array(temp)?
				// employees==> temp ===> can i write the for loop? Yes
				// but we will use some predefined methods from the java.
				//System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
				// Object src : source array
				// int srcPos : start location from source to  do the copy work
				// Object dest : dest array (where we want to copy the content)
				// int destPost : start pos for destination array
				// int length : no of elements to be copied from src to dest)
				
				System.arraycopy(employees, 0, temp, 0, employees.length);
				// arrays.copy 
				
				employees= temp;
				employees[count] = employee;
				return "success";
			}
			
		}
		else {
			return " not valid entry";
		}
		
	}
		
		// to delete the element from the array
		
		public String deleteEmployeeById(String id) {
			
			for (int i = 0; i < employees.length; i++) {
				if(employees[i].getEmpId().equals(id)) {
					// equals method :
					// we should not use == for checking the equality.
					
					employees[i] = null;
					return "success";
				}
			}
		return "fail";
	}
		
		// get employee details on basis of ID
		
		public Employee getEmployeebyId(String id) {
			
			for (Employee employee : employees) {
				// employee not equal to null & id = EmpID
				if (employee!=null && employee.getEmpId().equals(id))
					// id.equals 
					return employee;
			}
			return null;
		}
		
		// return all employees
		
		public Employee[] getAllEmployees() {
			return employees;
		}
		
		// return all employees on basis of name
		
		public Employee[] getEmployeesByName(String name) {
			
			Employee[] temp = new Employee[employees.length];
			int counter = -1;
			// starts -1 to include 0 
			
			for (int i=0; i < employees.length; i++) {
				
				if(employees[i]!=null && name.equals(employees[i].getEmpFirstName()))  {
				// add employee into array	
					temp[++counter] = employees[i];
				}
			}
			return temp;
			
		}
		
		// update
		public String updateEmployeeById(String id, Employee employee) {
			
			
		}
		
		
}
