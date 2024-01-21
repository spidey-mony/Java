package JAVALESSON;

import JAVALESSON.*;

public class Main {
    public static int input(int a) throws IllegalArgumentException{
        if(a==0){
            throw new IllegalArgumentException("You Cannot input Zero");
        }
        else {
            return a;
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(input(1));
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("This is the end of code");
    }
}