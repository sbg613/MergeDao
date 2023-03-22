package com.sbg613.code;

public enum Week {

      MON("월요일")
    , TUE("화요일")
    , WED("수요일")
    , THU("목요일")
    , FRI("금요일")
    , SAT("토요일")
    , SUN("일요일");

    final private String name;
    
    private Week(String name) { //enum에서 생성자 같은 역할
        this.name = name;
    }
    public String getName() { // 문자를 받아오는 함수
        return name;
    }
}
