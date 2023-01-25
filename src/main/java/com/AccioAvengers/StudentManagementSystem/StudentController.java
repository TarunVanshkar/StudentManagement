package com.AccioAvengers.StudentManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController    // Always write this annotation before a class which will become logic of API
public class StudentController
{
    Map<Integer, Student> db=new HashMap<>();   // HshMap to store a data and used as DataBase--> primary key=enrollmentNo
    // we should have CRUD in basic API

    // adding the information
    @PostMapping("/add_student")      // here "/add_student" is endpoint of API/URL
    public String addStudent(@RequestBody Student student)     // passing a JSON body from postman
    {
        int enrollmentNo=student.getEnrolmentNo();
        db.put(enrollmentNo,student);   // Stored data in db--> Post Mapping
        return "Student added successful";
    }

    // API logic to get information
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("q") int enrollmentNo)    // "q" is a variable(request parameter) to store a data and take to db
    {
        return db.get(enrollmentNo);
    }


    // API logic to delete data
    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable("id") int enrollmentNo)
    {
        if(!db.containsKey(enrollmentNo))
        {
            return "Invalid Enrollment Number";
        }

        db.remove(enrollmentNo);
        return "Student removed successfully";
    }

    // API logic to update data in non primitive data type(reference)
    @PutMapping("update_student")
    public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age)   // age need to be updated by id or enrollment number
    {
        if(!db.containsKey(id))
        {
            return "Invalid Enrollment Number";
        }

        Student student=db.get(id);
        student.setAge(age);
        return "Data updated successfully";
    }

}
