package todos;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@JsonFormat
@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {
    @Autowired
    private Todoservice todoservice;


////first endpoint from crud operation = get method (read)
    @GetMapping(value = {"/", ""})
    public List<Todo> getAllTodos(){

        return todoservice.findALL();


    }
    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoservice.getById(id);

    }

    ////// second endpoint = post method (create)
    @PostMapping(value = {"/", ""})
    public Todo creatnewtodo(@RequestBody Todo todo){
        if (todoservice.save(todo)){
            return todo;
        }
        return null;

    }





    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id){
        todoservice.delete(id);
    }
}
