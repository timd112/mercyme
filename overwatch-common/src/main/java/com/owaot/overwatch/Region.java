package com.owaot.overwatch;

public enum Region {
  US("us");

  private final String name;

  private Region(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
