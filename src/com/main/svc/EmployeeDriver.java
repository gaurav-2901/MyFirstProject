package com.main.svc;

import com.main.dto.Employee;

public class EmployeeDriver {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setEmpId(01);
        employee.setEmpName("Gaurav Chavan");

        EmpSvc empSvc = new EmpSvcImpl();

        System.out.println(empSvc.getEmpId(employee));


    }
}
