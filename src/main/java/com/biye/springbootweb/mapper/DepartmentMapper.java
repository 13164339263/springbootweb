package com.biye.springbootweb.mapper;


import com.biye.springbootweb.bean.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

//dao层
//指定这是操作数据库的mapper
@Component
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id) ;

    @Insert("insert into department (departmentName) values (#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
