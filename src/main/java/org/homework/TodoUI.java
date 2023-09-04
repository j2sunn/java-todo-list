package org.homework;

import java.util.Scanner;

public class TodoUI {

    private TodoManager todoManager;
    private Scanner sc = new Scanner(System.in);


    public TodoUI(){
        this.todoManager = new TodoManager();
    }

    public void run() throws Exception{
        InputOption option;

        do {
            System.out.println("옵션을 선택하세요: 1. 추가, 2. 삭제, 3. 조회, 4. 종료");
            String input = sc.nextLine();
            option = InputOption.of(input);
            switch (option) {
                case INSERT:        //추가
                    todoManager.insert(input);
                    break;

                case DELETE:        //삭제
                    todoManager.delete(Integer.parseInt(input));;
                    break;

                case SELECT:            //조회
                    todoManager.select(Integer.parseInt(input));
                    break;

                case EXIT:        //종료
                    System.out.println("프로그램을 종료합니다.");
                    return;

                case invalidInput:
                    System.out.println("잘못된 입력입니다.");

            }
        }while(option != InputOption.EXIT);

        sc.close();

    }













}//class end
