package todos;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Todoservice {
    private List<Todo>data = new ArrayList<>(Arrays.asList(
            new Todo(1, "first Todo", " this is the first task"),
            new Todo(2, "second Todo", " this is the second task"),
            new Todo(3, "third Todo", " this is the third task"),
            new Todo(4, "fourth Todo", " this is the fourth task"),
            new Todo(5, "fifth Todo", " this is the fifth task"))
    );
    public List<Todo>findALL(){
        return data;
    }
    public Todo getById(int id){
        for (Todo todo: data){
            if (todo.getId() == id) return todo;
        }
        return null;
    }
    public boolean save(Todo todo){
        return data.add(todo);
    }
    public void delete(int id){
        for (Todo todo:data){
            if (todo.getId() == id ){
                data.remove(todo);
            }
        }

    };

}

