package com.java8.functions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeUtility {

  public static Employee getEmployees(int id) {

    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
    List<Employee> employeeList = new ArrayList<>();
    try {
      // Assuming this as source
      employeeList.add(new Employee(121, 1000.23, "Dan", sdf.parse("12/10/2014")));
      employeeList.add(new Employee(131, 980.23, "Arch", sdf.parse("10/9/2015")));
      employeeList.add(new Employee(141, 700.23, "Jane", sdf.parse("12/10/2009")));
      employeeList.add(new Employee(151, 1000.21, "Dan", sdf.parse("12/10/2013")));

    }
    catch (ParseException e) {
      e.printStackTrace();
    }
    // Predicate
    return employeeList.stream().filter(employee -> employee.getId() == id).findFirst().orElseGet(null);
  }

  public static List<Employee> getEmployees(boolean findAll) {

    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
    List<Employee> employeeList = new ArrayList<>();
    try {
      employeeList.add(new Employee(121, 1000.23, "Dan", sdf.parse("12/10/2014")));
      employeeList.add(new Employee(131, 980.23, "Arch", sdf.parse("10/9/2015")));
      employeeList.add(new Employee(141, 700.23, "Jane", sdf.parse("12/10/2009")));
      employeeList.add(new Employee(151, 1000.21, "Dan", sdf.parse("12/10/2013")));

    }
    catch (ParseException e) {
      e.printStackTrace();
    }
    return employeeList;
  }

}
