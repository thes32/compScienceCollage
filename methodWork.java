package main;
import java.util.*;

class demos {
	private int ssn;
	private String empName;
	private int empAge;
	
	public int getEmpSSN() {
		return ssn;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	public void setEmpName(String newValue) {
		empName = newValue;
	}
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
}

public class methodWork {
	public static void main(String[] args) {
		demos obj = new demos();
		obj.setEmpName("Joe");
		obj.setEmpAge(29);
		obj.setEmpSSN(1102923);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
	}
}