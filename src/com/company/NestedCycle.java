package com.company;

public class NestedCycle {

    public static void main(String[] args) {
        NestedCycle ns=new NestedCycle();
        int size=5;
        System.out.println("Реализовать программу которая выводит в консоли прямоугольник из символов #");
        ns.a(size);
        System.out.println("!---------------------------------------------!");
        System.out.println("Реализовать программу, которая рисует следующие фигуры (на выбор 2-3, но можно и все при желании):");
        ns.bA(8);
        System.out.println("!---------------------------------------------!");
        ns.bB(8);
        System.out.println("!---------------------------------------------!");
        ns.bC(8);
        System.out.println("!---------------------------------------------!");
        ns.bD(8);
        System.out.println("!---------------------------------------------!");
        ns.bE(8);
    }

    public void a(int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public void bA(int size){                             // Task b(A)
        for(int i=size;i>0;i--){
            for(int j=0;j<size-i+1;j++){
                System.out.print("#");
            }
            System.out.println("");
        }
    }
    public void bB(int size){                             // Task b(B)
        for(int i=0;i<size;i++){
            for(int j=size-i;j>0;j--){
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public void bC(int size){                             // Task b(C)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(j<i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }

            }
            System.out.println("");
        }
    }

    public void bD(int size){                             // Task b(D)
        for(int i=size;i>0;i--){
            for(int j=1;j<=size;j++){
                if(j<i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }

            }
            System.out.println("");
        }
    }
    public void bE(int size){                             // Task b(E)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1){
                    System.out.print("#");

                }else{
                    if(j==0 || j==size-1){
                        System.out.print("#");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
    }
}
