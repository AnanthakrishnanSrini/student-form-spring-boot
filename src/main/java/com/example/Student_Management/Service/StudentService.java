package com.example.Student_Management.Service;

import com.example.Student_Management.Entity.StudentEntity;
import com.example.Student_Management.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public void saveDetails(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }
    public List<StudentEntity> getAllDetails(){
        return studentRepository.findAll();
    }
    public  StudentEntity getStidentDetailsById(long id){
        return  studentRepository.findById(id).orElse(null);

    }
    public StudentEntity updateDetails(StudentEntity studentEntity) {
        StudentEntity updateStudent = studentRepository.findById(studentEntity.getId()).orElse(null);
        if(updateStudent !=null){
            updateStudent.setName(studentEntity.getName());
            updateStudent.setEmail(studentEntity.getEmail());
            updateStudent.setMobile(studentEntity.getMobile());
            updateStudent.setAddress(studentEntity.getAddress());

            studentRepository.save(updateStudent);
            return updateStudent;

        }
        return  null;
    }


    public String deleteStudent(long id) {
        studentRepository.deleteById(id);
        return  "deleted"+id;
    }


}
