package org.homework;

import java.util.Scanner;

public class TodoUI {

    private final TodoManager todoManager;
    private final Scanner sc = new Scanner(System.in);


    public TodoUI() {
        this.todoManager = new TodoManager();
    }

    public void run() throws Exception {
        InputOption option;
        do {
            System.out.println("옵션을 선택하세요: 1. 추가, 2. 삭제, 3. 조회, 4. 완료 5. 종료");
            String input = sc.nextLine();
            option = InputOption.of(input);

            switch (option) {
                case INSERT:        //추가
                    insert();
                    break;

                case DELETE:        //삭제
                    delete();
                    break;

                case SELECT:        //조회
                    select();
                    break;

                case EXIT:          //종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                case INVALID_INPUT:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        } while (true);
    }

    private int getInput(String prompt) {
        int result = -1;

        while (true) {
            System.out.println(prompt);

            try {
                result = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("올바른 숫자를 입력하세요.");
            }
        }

        return result;
    }

    private void insert() {
        System.out.println("할 일을 입력하세요.");
        String content = sc.nextLine();
        int id = todoManager.insert(content);
        System.out.println("할 일이 추가되었습니다. ID: " + id);
    }

    private void delete() {
        int id = getInput("삭제할 ID를 입력하세요.");

        if (todoManager.delete(id)) {
            System.out.println("할 일이 삭제되었습니다. ID: " + id);
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }

    }

    private void select() {
        int id = getInput("조회할 ID를 입력하세요.");

        String content = todoManager.select(id);
        if (content != null) {
            System.out.println("할 일 ID: " + id + " 내용: " + content);
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

}//class end
