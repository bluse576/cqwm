package com.sky.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import com.sky.result.Result;

public interface EmployeeService {

    /**
     * 员工登录
     * 
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * 
     * @param employeeDTO
     * @return
     */
    void save(EmployeeDTO employeeDTO);

}
