package com.biye.springbootweb.Controller;


import com.biye.springbootweb.bean.Department;
import com.biye.springbootweb.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public int insertDept(Department department){
        int i=departmentMapper.insertDept(department);
        return i;
    }
    public static void main(String[] args) {
        SpringApplication.run(DeptController.class, args);
    }

}
