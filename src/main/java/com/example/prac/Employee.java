package com.example.prac;

import java.util.Objects;

public class Employee {
	 	int empId;
	    String empName;
	    long empSalary;

	    public Employee(int empId, String empName, long empSalary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.empSalary = empSalary;
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	    public long getEmpSalary() {
	        return empSalary;
	    }

	    public void setEmpSalary(long empSalary) {
	        this.empSalary = empSalary;
	    }
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "empId=" + empId +
	                ", empName='" + empName + '\'' +
	                ", empSalary=" + empSalary +
	                '}';
	    }

		@Override
		public int hashCode() {
			return Objects.hash(empId, empName, empSalary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return empId == other.empId && Objects.equals(empName, other.empName) && empSalary == other.empSalary;
		}
	}	//Next, we will be creating an object and performing a few operations on this collections of data using stream API.



