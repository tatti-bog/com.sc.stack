package com.company;
import ibadts.Stack;
import ibadts.StaticStack;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
         hm2();

    }
     public static void hm2 () {

         StaticStack<String> stackSt = new StaticStack<>(4);
         try (Scanner scanner = new Scanner(System.in))
         {
             while (!stackSt.isFull())
             {
                 System.out.println("write down words:  ");
                 if (scanner.hasNext())
                 {
                     stackSt.push(scanner.next());
                 }
             }

         }

         while (!stackSt.isEmpty())
             System.out.println(stackSt.pop());

    }
   
}
