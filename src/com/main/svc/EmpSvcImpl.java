package com.main.svc;

import com.main.dto.Employee;

public class EmpSvcImpl implements EmpSvc {

    @Override
    public String getEmpId(Employee employee) {
        return "Employee ID is "+employee.getEmpId();

    }
}
