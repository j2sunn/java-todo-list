package org.homework;

import java.util.HashMap;

public class TodoManager {

    private int id = 1;
    private final HashMap<Integer, String> todolist =  new HashMap<>();


    public int insert(String content) {
        todolist.put(id, content);
        return id++;
    }

    public boolean delete(int id) {
        if(todolist.containsKey(id)){
            return todolist.remove(id) != null;
        } else {
            return false;
        }
    }

    public String select(int id) {
        return todolist.getOrDefault(id, "해당 ID의 할 일이 없습니다.");
    }
}
