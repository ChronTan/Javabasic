package com.company;

public class NestedCycle {

    public static void main(String[] args) {
        NestedCycle ns=new NestedCycle();
        int size=7;
        System.out.println("Реализовать программу которая выводит в консоли прямоугольник из символов #");
        ns.a(size);
        System.out.println("!---------------------------------------------!");
        System.out.println("Реализовать программу, которая рисует следующие фигуры (на выбор 2-3, но можно и все при желании):");
        ns.bA(size);
        System.out.println("!---------------------------------------------!");
        ns.bB(size);
        System.out.println("!---------------------------------------------!");
        ns.bC(size);
        System.out.println("!---------------------------------------------!");
        ns.bD(size);
        System.out.println("!---------------------------------------------!");
        ns.bE(size);
        System.out.println("!---------------------------------------------!");
        ns.bF(size);
        System.out.println("!---------------------------------------------!");
        ns.bG(size);
        System.out.println("!---------------------------------------------!");
        ns.bH(size);
        System.out.println("!---------------------------------------------!");
        ns.bI(size);
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

    public void bF(int size){                             // Task b(F)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1){
                    System.out.print("#");
                }else{
                    if(i==j){
                        System.out.print("#");
                    }else
                    {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println("");
        }
    }

    public void bG(int size){                             // Task b(G)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1){
                    System.out.print("#");
                }else{
                    if((i+j)==size-1){
                        System.out.print("#");
                    }else
                    {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println("");
        }
    }

    public void bH(int size){                             // Task b(H)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1){
                    System.out.print("#");
                }else{
                    if((i+j)==size-1 || i==j){
                        System.out.print("#");
                    }else
                    {
                        System.out.print(" ");
                    }
                }


            }
            System.out.println("");
        }
    }

    public void bI(int size){                             // Task b(I)
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==0 || i==size-1){
                    System.out.print("#");
                }else{
                    if((i+j)==size-1 || i==j){
                        System.out.print("#");
                    }else
                    {
                        if(j==0 || j==size-1){
                            System.out.print("#");
                        }else{
                            System.out.print(" ");
                        }

                    }

                }

            }
            System.out.println("");
        }
    }
}
