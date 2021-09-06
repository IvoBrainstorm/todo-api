package com.matavele.rest.restfulwebservice.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardCodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static long idTodo = 0;

    static {
        todos.add(new Todo(++idTodo, "matavele", "Learn to Dance", new Date(), false));
        todos.add(new Todo(++idTodo, "matavele", "Learn Java", new Date(), false));
        todos.add(new Todo(++idTodo, "matavele", "Learn Spring Boot", new Date(), false));
        todos.add(new Todo(++idTodo, "matavele", "Learn about Microservices", new Date(), false));
    }

    public static List<Todo> listTodos(String username){
        return todos;
    }
}
