package com.alsav3;


public class Main {

    public static void main(String[] args) {

    Employee employee = new Employee();
    Employee employee1 = new Employee();

    employee.setName("Musa Dlamini");
    employee.setPosition("CEO");
    employee.setAge(28);

    employee1.setAge(40);

    System.out.println(employee1.getAge());

    System.out.println("Name: \t"+employee.getName()+"\tPosition: "+employee.getPosition()+"\tAge: "+employee.getAge());

    }

}
