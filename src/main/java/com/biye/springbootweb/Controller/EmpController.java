package com.biye.springbootweb.Controller;

import com.biye.springbootweb.bean.Employee;
import com.biye.springbootweb.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable("id") Integer id){
        System.out.println(id+"--------------------");
        return employeeMapper.getEmpById(id);
    }

}
