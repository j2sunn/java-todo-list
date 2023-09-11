package org.homework;

import java.util.HashMap;

public class TodoManager {
    private int id = 1;
    private final HashMap<Integer, String> todolist = new HashMap<>();

    public int insert(String content) { //할 일의 내용을 입력 받아 Map에 저장
        todolist.put(id, content);
        return id++;
    }

    public boolean delete(int id) {     //삭제할 할 일의 ID를 입력 받아 Map에서 해당 할 일을 삭제
        return todolist.remove(id) != null;
    }

    public String select(int id) {      // 조회할 할 일의 ID를 입력 받아 Map에서 해당 할 일의 정보를 출력
        return todolist.getOrDefault(id, "해당 ID의 할 일이 없습니다.");
    }


}//class end
