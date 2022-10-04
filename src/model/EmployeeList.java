/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author qiaotong
 */
public class EmployeeList {
    private ArrayList<Employee> employeeList;

    public EmployeeList(){
        employeeList = new ArrayList<Employee>();
    }
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
    
    public void deleteEmployee(int index) {
        employeeList.remove(index);
    }
    
    public void updateEmployee(int index,Employee employee) {
        employeeList.set(index,employee);
    }
}
