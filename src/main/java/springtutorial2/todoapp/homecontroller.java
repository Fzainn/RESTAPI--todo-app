package springtutorial2.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import todos.Todo;

@RestController
public class homecontroller {
    public class Homecontroller {

    }
        @RequestMapping(value = "/")
        public String greeting() {
            return "Hello,welcome to SpringBoot!";

        }
        @GetMapping(value = "/{name}")
        public String greetingwithName(@PathVariable String name){


            return String.format("welcom %s to our stringboot App!", name);
        }

    @RestController
    @RequestMapping(value = "/api-todo")
    public static class TodoController {

        @GetMapping("/")
        public Todo listTodos(){
            Todo test = new Todo(1, "First Todo", "this is my first task");
            return test;
        }

    }
}