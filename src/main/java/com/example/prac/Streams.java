package com.example.prac;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	
	static ArrayList<Employee> employees = new ArrayList<>();
	//	Write a Java program to calculate the average of a list of integers using streams.
	public static void calculateAvg() {
		
//		The reason of why list.stream().count() works but list.stream().sum() doesn't is 
//		because list.stream() returns a Stream<Integer> and there is a Stream::count method, 
//		but there isn't a Stream::sum or Stream::average.

//		To get the sum and avg first you have to map each integer value in the Stream<Integer> that you get when you do list.stream() 
//		to an IntStream. This is the int primitive specialization of Stream. This can be done using the Stream::mapToInt method
		
		List<Integer> l1 = List.of(1,2,3,4,5,1);
		
		System.out.println("average "+l1.stream().mapToDouble(Integer::doubleValue).average());
		
//		for sum
		System.out.println("Sum "+l1.stream().mapToInt(Integer::intValue).sum());
		
//		count
		System.out.println("count "+l1.stream().count());
		
		//distinct
		System.out.println("Distinct "+l1.stream().distinct().collect(Collectors.toList()).toString());		
		
	}
	
	public static void employeeData() {
		// print employee data
		employees.stream().forEach(data -> System.out.println(data.toString()));
		System.out.println();
		employees.stream().forEach(System.out::println);
		System.out.println();
		
		//Print the employee data by sorting employee salaries in descending order.
		employees.stream().sorted((a,b)->Long.compare(b.getEmpSalary(), a.getEmpSalary())).forEach(data->System.out.println(data));
		System.out.println();
		employees.stream().sorted((Comparator.comparingLong(Employee::getEmpSalary).reversed())).forEach(data->System.out.println(data));
		System.out.println();
		
		//Filter the employee names starting with ‘J’
		Stream<Employee> e = employees.stream();        // ***this can we used only once stream will get closed upon first use
		e.filter(data -> data.getEmpName().startsWith("J")).forEach(data->System.out.println(data));
		System.out.println();
		
		// sort with salary in ascending order than sort with name descending order
		e = employees.stream();   // ***this can we used only once stream will get closed upon first use
		e.sorted(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				int val = Long.compare(e1.getEmpSalary(), e2.getEmpSalary());
				if(val == 0)
					val = e2.getEmpName().compareToIgnoreCase(e1.getEmpName());
				return val;
			}
		}).forEach(System.out::println);
		System.out.println();
									// or
//		e = employees.stream();					
//		e.sorted((Employee e1, Employee e2)-> {
//				int val = Long.compare(e1.getEmpSalary(), e2.getEmpSalary());
//				if(val == 0)
//					val = e2.getEmpName().compareToIgnoreCase(e1.getEmpName());
//				return val;
//			}
//		).forEach(System.out::println);
		
		// remove duplication from employee list with id
		e = employees.stream();	
		Set<Integer> hs = new HashSet<Integer>();
		System.out.println(e.map(data -> data.getEmpId()).filter(data -> !hs.add(data)).collect(Collectors.toSet()).toString());
		System.out.println();
//		e = employees.stream();	
//		 System.out.println(e.collect(Collectors.toMap(Employee::getEmpName, Function.identity(), (p1, p2) -> {
//            if (p1.getEmpId() > p2.getEmpId())
//                return p1;
//            else
//                return p2;
//        })).values().toString()
//				 );
	}
	
	

	public static void main(String[] args) {
		 
		 employees.add(new Employee(1,"James",(long)23000));
		 employees.add(new Employee(1,"John",(long)23000));
		 employees.add(new Employee(2,"Doug",(long)190000));
		 employees.add(new Employee(3,"Jack",(long)200000));
		 employees.add(new Employee(4,"Daisy", (long)240000));
		 employees.add(new Employee(5,"William", (long)220000));
		 
		 calculateAvg();
		 employeeData();
	}

}
