package com.company;

public class Factorial {

    public static void main(String[] args) {
        Factorial f=new Factorial();
        System.out.println("Необходимо реализовать алгоритм вычисления факториала двумя способами:\n" +
                "a.\tС помощью цикла\n" +
                "b.\tС помощью рекурсии\n" +
                "Сравнить время выполнения a и b используя System.nanoTime()\n");
        int number=8;
        int factorial=1;
        long startTime;
        long estimatedTime;
        long a;
        long b;

        startTime = System.nanoTime();
        for(int i=1;i<=number;i++){                           // using a cycle
            factorial*=i;
        }
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Cycle");
        System.out.println("number:"+number+ ", result:"+ factorial );
        System.out.println("time work cycle:"+ estimatedTime);
        factorial=1;
        a=estimatedTime;
        System.out.println("---------------------");
        startTime = System.nanoTime();
        factorial=f.f(number);                                //call method recursion
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("Recursion");
        System.out.println("number:"+number+ ", result:"+ factorial );
        System.out.println("time work factorial:"+ estimatedTime);
        b=estimatedTime;
        System.out.println("--------------------");
        System.out.println(a<b?"faster cycle sorting":"faster recursion sorting");

    }

    public int f(int a){                                      // method recursion
        int result;
        if(a == 1)
            return 1;
        result = f(a - 1) * a;

        return result;
    }
}
