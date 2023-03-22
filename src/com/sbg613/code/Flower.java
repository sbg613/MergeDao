package com.sbg613.code;

public enum Flower {

    Ageratum("아게라텀")
  , Aster("아스터");

  final private String name;
  
  private Flower(String name) { //enum에서 생성자 같은 역할
      this.name = name;
  }
  public String getName() { // 문자를 받아오는 함수
      return name;
  }
}
