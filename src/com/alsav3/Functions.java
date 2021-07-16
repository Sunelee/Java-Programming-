package com.alsav3;

public class Functions {
    //access modifier, return type, name, parameter list
    public int addNumbers(int num1, int num2){
        if (num1 == 0 && num2 == 0){
            return 0;
        }
       return num1 + num2;
    }

    public int multiplyNumbers(int num1, int num2){
        if (num1 == 0 && num2 == 0){
            return 0;
        }
        return num1 * num2;
    }

    public int divideNumbers(int num1, int num2){
        if (num1 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public String sayMyName(String name){
        return name;
    }
}
