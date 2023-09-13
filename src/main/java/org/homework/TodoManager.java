package org.homework;

import java.util.HashMap;

public class TodoManager {
    private int id = 1;
    private final HashMap<Integer, String> todolist = new HashMap<>();

    public int insert(String content) {
        todolist.put(id, content);
        return id++;
    }

    public boolean delete(int id) {
        return todolist.remove(id) != null;
    }

    public String select(int id) {
        return todolist.getOrDefault(id, "해당 ID의 할 일이 없습니다.");
    }

    public String complete(int id) {

        if (todolist.containsKey(id)) {
            String content = todolist.get(id) + " [완료]";
            todolist.put(id, content);
            return content;
        } else {
            return "해당 ID의 할 일이 없습니다.";
        }
    }

    public void selectAll() {
        if (todolist.isEmpty()) {
            System.out.println("할 일 목록이 비어 있습니다.");
        } else {
            for (int id : todolist.keySet()) {
                String content = todolist.get(id);
                System.out.println("ID: " + id + " 내용: " + content);
            }
        }
    }

}//class end
