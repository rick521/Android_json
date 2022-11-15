package com.example.android_json;

/**
 * Created by Mr.Chan
 * Time 2022-11-15
 * Blog https://www.cnblogs.com/Frank-dev-blog/
 */
public class Person {
    private String id;
    private String name;
    private String age;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return this.name + "age:" + this.age;
    }
}
