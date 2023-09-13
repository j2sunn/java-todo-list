package org.homework;


enum InputOption {
    INSERT("1"),    //1. 추가
    DELETE("2"),    //2. 삭제
    SELECT("3"),    //3. 조회
    SELECTALL("4"),  //4. 전체 할 일 목록 출력
    COMPLETE("5"),  //5. 완료
    EXIT("6"),       //6. 종료
    INVALID_INPUT("");

    private final String input;

    InputOption(String input) {
        this.input = input;
    }

    public static InputOption of(String input) {

        for (InputOption value : InputOption.values()) {
            if (value.input.equals(input)) {
                return value;
            }
        }
        return INVALID_INPUT;
    }

}

