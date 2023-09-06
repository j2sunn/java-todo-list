package org.homework;

import java.util.HashMap;

public class TodoManager {

    private int id = 1;
    private final HashMap<Integer, String> todolist =  new HashMap<>();


    public int insert(String content) {
        todolist.put(id, content);
        int insertId = id;
        id ++;
        return insertId;
    }

    public boolean delete(int id) {
        if(todolist.containsKey(id)){
            todolist.remove(id);
            return true;
        } else {
            return false;
        }
    }


    public String select(int id) {
        return todolist.getOrDefault(id, null);
    }
}
