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

  public static Region getByName(String name){
    switch(name.toLowerCase()){
      case "us":
        return US;
      default:
        return US;
    }
  }
}
