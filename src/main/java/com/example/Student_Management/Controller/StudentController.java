package com.example.Student_Management.Controller;

import com.example.Student_Management.Entity.StudentEntity;
import com.example.Student_Management.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
    @Autowired
    private StudentService studentService;



    @PostMapping("/savestudent")
    public ResponseEntity<String> addStudent(@RequestBody StudentEntity studentEntity) {
        studentService.saveDetails(studentEntity);
        return new ResponseEntity<>("Student added successfully", HttpStatus.CREATED);
    }


    @GetMapping("/getAlls")
    public List<StudentEntity> getDetails(){
        return  studentService.getAllDetails();
    }

    @GetMapping("/getBystudentId/{id}")
    public StudentEntity fetchDetailsByid(@PathVariable long id){
        return  studentService.getStidentDetailsById(id);
    }
    @PutMapping("/updateStudents")
    public String updatedetailsStudent(@RequestBody StudentEntity studentEntity) {
        studentService.updateDetails(studentEntity);
        return "Posted";
    }

    @DeleteMapping ("/deleteStudent/{id}")
    public String deleteid(@PathVariable long id) {
        return studentService.deleteStudent(id);

    }
}
