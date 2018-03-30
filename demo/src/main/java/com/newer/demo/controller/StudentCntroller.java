package com.newer.demo.controller;

import com.newer.demo.bean.Student;
import com.newer.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentCntroller {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/student")
    public ResponseEntity<?> findAll(){
        List<Student> list=studentService.findAll();
        return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
    }
}
