package com.dssn.model;

public class Users {
  private  int id;
  private  String name;
  private  String gender;
  private  int age ;
  private String image;

    public Users(){


    }
    public Users(int id ,String name,String gender ,int age ,String image){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.image=image;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

}
