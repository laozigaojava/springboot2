package com.newer.demo.service;

import com.newer.demo.bean.Student;
import com.newer.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED ,readOnly = true)
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll(){
        return  studentMapper.findAll();
    }
}
