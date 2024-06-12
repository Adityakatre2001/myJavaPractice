package com.app.emp_operation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.app.core.Employee;

public class Emp_Operation {

	public static void addFTE(Employee e,List<Employee>elist) {
		elist.add(e);
		System.out.println(elist);	
	}
	
	public static void deleteEmpByEmpId(int id,List<Employee>eList) {
		for(Employee e: eList) {
			
			if(e.getEmpid()==id) {
				int i = eList.indexOf(e);
				eList.remove(i);
				System.out.println(eList);
			}
		}
	}
	
	public static void searchEmployeeDetailsByAdharNumber(Long Adhar,List<Employee>eList) {
		for(Employee e: eList) {
			if(e.getAdharNumber().equals(Adhar)) {
				System.out.println(e);
			}
		}
		
	}
	
	public static List<Employee> sortEmployeeByJoiningDate(List<Employee>eList) {
		Collections.sort(eList,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDateOfJoining().compareTo(o2.getDateOfJoining());
			}
		});
		return eList;
		
	}
	


}
