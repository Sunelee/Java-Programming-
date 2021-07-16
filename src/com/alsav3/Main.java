package com.alsav3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    Loops loops = new Loops(); //loops class [object]
        Functions func = new Functions();

        //functions
//        System.out.println("Please enter num 1");
//        int num1 = scanner.nextInt();
//        System.out.println("Please enter num 2");
//        int num2 = scanner.nextInt();
//
//        int sum = func.divideNumbers(num1,num2);
//        if (sum == 0){
//            System.out.println("One number is zero");
//        }else{
//            System.out.println(sum);
//        }
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        String saidName = func.sayMyName(name);
        System.out.println("Your name is: "+saidName);


//    loops.forLoop(7, 90);
//        loops.forLoop(90, 4);
//        loops.forLoop(0, 500);

    }

    void oIt(){

    }
}
