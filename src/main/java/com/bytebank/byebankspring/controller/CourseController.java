package com.bytebank.byebankspring.controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    public @ResponseBody List<Course> list() {
        return courseRepository.findAll();
    }

    // @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    // ResponseEntity: retorna o statuc code de acordo com a requisição
    // outra forma de retornar o status code correto
    @ResponseStatus(code = HttpStatus.CREATED)
    // @ResponseEntity<Course>: outra forma de setar o status code
    public Course create(@RequestBody Course course) {
        System.out.println(course.getValor());
        // save: metodo para salvar informaçções no banco de dados;
        // return ResponseEntity
        //     .status(HttpStatus.CREATED)
        //     .body(courseRepository.save(course));
        return courseRepository.save(course);
    }

}
