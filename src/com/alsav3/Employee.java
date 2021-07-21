package com.alsav3;

public class Employee {


    //attributes
    private String name;
    private int age;
    private String position;
    private String address;

    public Employee(String name, int age, String position, String address){
        this.name = name;
        this.age = age;
        this.position = position;
        this.address = address;
    }
    public Employee(double salary){
        System.out.println(salary);
    }
    public Employee(int age){
        this.age = age;
    }

    public String getName() {
        return name.trim();
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position.strip();
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


