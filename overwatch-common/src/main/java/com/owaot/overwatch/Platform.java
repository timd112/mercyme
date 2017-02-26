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

  public static Platform getByName(String name){
    switch(name.toLowerCase()){
      case "pc":
        return PC;
      case "xb1":
        return XBOX;
      case "psn":
        return PLAYSTATION;
      default:
        return PC;
    }
  }
}
