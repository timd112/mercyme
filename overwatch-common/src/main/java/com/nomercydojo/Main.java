package com.nomercydojo;


import org.apache.http.client.methods.HttpGet;

public class Main {
  private static final String OW_URL_FMT = "https://playoverwatch.com/en-us/career/pc/en-us/%s";

  HttpGet get = new HttpGet(String.format(OW_URL_FMT, "liquidswords-11931"));


}
