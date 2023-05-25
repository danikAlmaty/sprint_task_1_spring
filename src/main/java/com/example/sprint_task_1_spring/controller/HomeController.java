package com.example.sprint_task_1_spring.controller;

import com.example.sprint_task_1_spring.model.StudentModel;
import com.example.sprint_task_1_spring.repositories.StudentModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final StudentModelRepository studentModelRepository;

    @GetMapping(value = "/")
    public String homePage(Model model){
        List<StudentModel> studentModelList = studentModelRepository.findAll();
        model.addAttribute("students", studentModelList);

        return "index";
    }

    @GetMapping(value = "/add-student")
    public String addStudent(){
        return "add_student";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(StudentModel student){
        studentModelRepository.save(student);
        return "redirect:/";
    }
}
