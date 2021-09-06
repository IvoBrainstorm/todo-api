package com.matavele.rest.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean/{name}")
    public  HelloWorldBean helloWorldVPath(@PathVariable String name){
        throw  new RuntimeException("Somethink went wrong");
//        return new HelloWorldBean(String.format("Hello world, %s", name));
    }

}
