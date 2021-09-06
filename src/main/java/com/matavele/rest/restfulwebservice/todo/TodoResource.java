package com.matavele.rest.restfulwebservice.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {

    @Autowired
    private TodoHardCodedService hardCodedService;

    @GetMapping(path = "/user/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return hardCodedService.listTodos(username);
    }

}
