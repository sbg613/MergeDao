package com.sbg613.sqlId;

public enum SqlId {

	SELECT_WEEK_ONE("달력 단건 조회")
  , SELECT_WEEK_LIST("달력 다건 조회")
  , SELECT_FLOWER_ONE("꽃 단건 조회")
  , SELECT_FLOWER_LIST("꽃 다건 조회");

  final private String name;
  
  private SqlId(String name) { //enum에서 생성자 같은 역할
      this.name = name;
  }
  public String getName() { // 문자를 받아오는 함수
      return name;
  }
  
}
