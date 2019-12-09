package com.home.dev.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "fullname")
    private String studentName;

    @Column(name = "email")
    private String studentEmail;

    @Column(name = "branch")
    private String studentBranch;

}
