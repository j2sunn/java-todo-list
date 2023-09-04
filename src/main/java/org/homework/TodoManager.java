package org.homework;

import java.util.HashMap;

public class TodoManager {

    private int id = 1;
    private HashMap<Integer, String> todolist =  new HashMap<>();


    public void insert(String content) {
        todolist.put(id, content);
        System.out.println("할 일이 추가되었습니다. ID:" + id);
        id ++;

    }

    public void delete(int id) {

        if(todolist.containsKey(id)){
            todolist.remove(id);
            System.out.println( "할 일이 삭제되었습니다. ID:" + id);
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }


    public void select(int id) {
        if(todolist.containsKey(id)){
            String content = todolist.get(id);
            System.out.println("할 일 ID: " + id + " 내용: " + content);
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

}
