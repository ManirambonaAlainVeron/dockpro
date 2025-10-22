package com.veron.dockpro.features;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="student_seq")
    @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String email;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
