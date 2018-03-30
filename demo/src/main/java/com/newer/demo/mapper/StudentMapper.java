package com.newer.demo.mapper;

import com.newer.demo.bean.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAll();
}
