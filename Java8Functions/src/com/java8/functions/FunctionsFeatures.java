package com.java8.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionsFeatures {

  public static void main(String[] args) {

    // Get the list with no value and convert to map
    List<Boolean> getAllList = Arrays.asList(new Boolean[] { true });
    Map<Integer, Employee> employeeMap = getAllList.stream().map(EmployeeUtility::getEmployees).findFirst().orElse(null)
        .stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
    System.out.println(employeeMap);

    // Get the sorted list with employee id
    List<Integer> idList = Arrays.asList(new Integer[] { 121, 131, 141, 151 });
    List<Employee> employeeList = new ArrayList<>();

    employeeList = idList.stream().map(EmployeeUtility::getEmployees).collect(Collectors.toList()).stream().sorted(
        Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
    System.out.println(employeeList);

  }

}
