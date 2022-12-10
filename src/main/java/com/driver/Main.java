package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly objRWOnly = new RWOnly(); // creating object of RWOnly class
      objRWOnly.setName("Hanif"); // setting the field 'name'
      System.out.println(objRWOnly.getName());
  }
}