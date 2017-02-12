package com.owaot.overwatch;

public enum Platform {
  PC("pc"),
  XBOX("xb1"),
  PLAYSTATION("psn");

  private final String name;

  private Platform(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}
