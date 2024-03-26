package task;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable {
	String name;
	Integer id,salary;
	
	Employee(String name,Integer id,Integer salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee a=(Employee) o;
		Integer b=a.id.compareTo(id);
		if(b==0)
			return 0;
			else if(b<0)
				return -1;
			else
				return 1;
	}
	public String toString() {
		return name+" "+id+" "+salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al =new ArrayList<>();
		al.add(new Employee("Aravind",1,80000));
		al.add(new Employee("Akash",4,90000));
		al.add(new Employee("vimala",3,100000));
		Collections.sort(al);
		System.out.println(al);
	}

}
