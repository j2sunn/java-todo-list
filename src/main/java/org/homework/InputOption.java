package org.homework;


enum InputOption {
    INSERT("1"),    //1. 추가
    DELETE("2"),    //2. 삭제
    SELECT("3"),    //3. 조회
    EXIT("4"),       //4. 종료
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

