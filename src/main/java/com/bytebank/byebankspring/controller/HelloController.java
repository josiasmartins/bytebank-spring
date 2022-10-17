package com.bytebank.byebankspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// acessar API
@RequestMapping("/")
public class HelloController {
    /**
     *  @RequestMapping 
     *  method: pode especificar os verbos da requisão, inclusive mais de um
     *  produces: espefica oque pode gerar o arquivo
     */
    // @RequestMapping(method = {RequestMethod.DELETE, RequestMethod.GET}, produces = )
    @GetMapping
    public String hello() {
        return "Hello, world";
    }
    
}
