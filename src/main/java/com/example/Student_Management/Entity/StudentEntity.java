package com.example.Student_Management.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "studentdetails")
public class StudentEntity {

    public StudentEntity(long id, String name, String email, String mobile, String address) {
        Id = id;
        Name = name;
        Email = email;
        Mobile = mobile;
        Address = address;
    }

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private long Id;
    @Column(name ="Name" )
    private String Name;
    @Column(name ="Email" )
    private String Email;
    @Column(name ="Mobile" )
    private String Mobile;
    @Column(name ="Address" )
    private String Address;

    public long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public StudentEntity() {
    }
}
