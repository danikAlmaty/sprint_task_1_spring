package com.example.sprint_task_1_spring.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_students")
@Getter
@Setter
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;


    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "exam")
    private int exam;

    @Column(name = "mark")
    private String mark;

    @PrePersist
    public void createValueOfMark(){
        if (this.exam >= 90)
            this.mark = "A";
        else if (this.exam>=75 && this.exam <= 89)
            this.mark = "B";
        else if (this.exam>=60 && this.exam <=74)
            this.mark = "C";
        else if (this.exam>=50 && this.exam <=59)
            this.mark = "D";
        else this.mark = "F";
    }

}
