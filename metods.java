package com.company;
import java.util.*;
public class Main {
//This is a program that demonstrates the work on functions in my days of challenge journey.
    public static void main(String[] args) {

	// write your code here
        int option ;
    do {
        
        int z,y;

    Scanner cin = new Scanner(System.in);
    System.out.println("1. please enter your first Value");
    z = cin.nextInt();
    System.out.println("2. please enter your first Value");
    y = cin.nextInt();


        System.out.println("Please select an option to proceed with.");
        System.out.println("1. Add");
        System.out.println("2. multiply");
        System.out.println("3. division");
        System.out.println("4. remainder");
        System.out.println("5. subtraction");
        option = cin.nextInt();


        if(option == 1){
            sum(z,y);
        }else if(option ==2){
            multiply(z,y);
        }
        else if(option == 3){
            division(z,y);
        }
        else if(option == 4){

            remainder(z,y);
        }
        else if(option == 5){
            subtraction(z,y);
        }
        else{
            System.out.println("please enter a valid digit.");
        }
    }while (option == 0);
    }
    //new method to add values
    public static void sum(int a , int b){
        int add = a + b;
        System.out.println(add);
        return;
    }


    //new method to add values
    public static void multiply(int a , int b){
        int product = a * b;
        System.out.println(product);
        return;
    }

    //new method to add values
    public static void division(int a , int b){
        int divide = a / b;
        System.out.println(divide);
        return;
    }

    //new method to add values
    public static void remainder(int a , int b){
        int remain = a % b;
        System.out.println(remain);
        return;
    }

    //new method to add values
    public static void subtraction(int a , int b){
        int sub = a - b;
        System.out.println(sub);
        return;
    }
}
