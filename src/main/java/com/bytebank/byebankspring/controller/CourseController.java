package com.bytebank.byebankspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytebank.byebankspring.model.Course;
import com.bytebank.byebankspring.repository.CourseRepository;

import lombok.AllArgsConstructor;

// @RestController: diz para classe que contem um endpoint
@RestController
// @RequestMapping: diz o endpoint
@RequestMapping("/api/courses")
// @Component: cria uma instância e gerencia o ciclo de vida
// @Component
// @AllArgsConstructor: injeta o service atraves do constructor
@AllArgsConstructor
public class CourseController {
    // @Autowired: usado para injetar o service. De acordo com as boas, utila o contructor no lugar dele
    // @Autowired
    private final CourseRepository courseRepository;

    // LIst: retorna uma lista 
    // outra forma de fazer: @RequestMapping(method = Request.GET)
    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }
}
