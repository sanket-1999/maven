package exam;

import java.awt.List;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Employee {
	
public 	 Map<String,LocalDate> mylist= new HashMap<String,LocalDate>();
	
	int id;
	double salary ;
	String name ;
	

	public Employee( int id, double salary, String name) {
		super();
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	void addemployeedate() {
		
		
		mylist.put("name1",LocalDate.of(2012, 1, 1));
		mylist.put("nam2",LocalDate.of(2015,2,2));
		mylist.put("name3", LocalDate.of(2017, 1, 2));
		mylist.put("name4", LocalDate.of(2019,1, 2));
		mylist.put( "name5",LocalDate.of(2017, 2, 2));
				
	}
	
	void tenurewiseemployee() {
		LocalDate dt=LocalDate.now();
		int Currentyear=dt.getYear();
		
		
		
		for(int i=0 ; i < 5 ;i++)
		{
			int year=mylist.get(i).getYear();
			if(Currentyear-year>=5)
			{
			System.out.println(mylist.get(i));	
			}
			else
			{
				System.out.println("no employee greater than 5 years");
			}
			
		}
				
	}
	
	
	void tenureWiseEmployeeCount() {
		
		
	
		HashMap<String,Integer> newlist= ((Collection) mylist).stream().collect(Collection.groupingBy((Employee::getName),((Stream) mylist).count()).forEach(System.out::println));
		
		
	}

	
}
