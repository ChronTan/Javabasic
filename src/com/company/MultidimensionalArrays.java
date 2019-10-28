package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MultidimensionalArrays {

    public static void main(String[] args) {
        MultidimensionalArrays ma=new MultidimensionalArrays();
        System.out.println("Создать двумерный массив размером 8 на 8. Заполнить его случайными числами в диапазоне " +"\n"+
                "[1;99] Вычислить и вывести на экран сумму и произведение элементов главной и побочной диагонали ");
        ma.a();
        System.out.println("!--------------------------------------------------------------------------------------------------!");
        System.out.println("Создать двумерный массив из 8 строк и 5 столбцов. " +"\n"+
                "Заполнить его случайными числами в отрезке [-99;99]. Вывести массив на экран. " +"\n"+
                " Вывести на экран значение и индексы максимального (по всем строкам и столбцам) элемента в массиве.  ");
        ma.b();
        System.out.println("!--------------------------------------------------------------------------------------------------!");
        System.out.println("Cоздать двумерный массив из 8 строк и 5 столбцов из случайных целых чисел в отрезке [-10;10]. "+"\n"+
                "Вывести массив на экран. Определить и вывести  на экран индекс строки с наибольшим по модулю произведением элементов.  ");
        ma.c();
        System.out.println("!--------------------------------------------------------------------------------------------------!");
        System.out.println("Создать двумерный массив из 10 строк и 7 столбцов из целых чисел в отрезке [0;100]. "+"\n"+
                "Вывести массив на экран. Отсортировать каждую строку в порядке убывания. Вывести преобразованный массив на экран. ");
        ma.d();
    }


    public void a(){
        Random r=new Random();
        int[][] mas=new int[8][8];
        int mainDSum=0;
        int mainDComp=1;
        long collateralDSum=0;
        long collateralDCopm=1;
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j]=r.nextInt(100);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                if(i==j){
                    mainDSum+=mas[i][j];
                    mainDComp*=mas[i][j];
                }
                if((i+j)==7){
                    collateralDSum+=mas[i][j];
                    collateralDCopm*=mas[i][j];
                }
            }
        }
        System.out.println("sum mainD "+ mainDSum);
        System.out.println("sum collateralD "+ collateralDSum);
        System.out.println("composition mainD "+ mainDComp);
        System.out.println("composition collateralD "+ collateralDCopm);

    }
    public void b(){
        Random r=new Random();
        int[][] mas=new int[8][5];
        int line=-1;
        int column=-1;
        int max=-100;
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j]=-99+r.nextInt(199);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                if(mas[i][j]>max){
                    max=mas[i][j];
                    line=i;
                    column=j;
                }
            }
        }
        System.out.println("max element: "+ max);
        System.out.println("indexes: "+ line+", "+ column);
    }

    public void c(){
        Random r=new Random();
        int[][] mas=new int[8][5];
        ArrayList<Integer> arr=new ArrayList<>();
        int line=-1;
        int max=-11;
        int composition=1;
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j]=-10+r.nextInt(21);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                composition*=mas[i][j];
            }
            arr.add(Math.abs(composition));
            composition=1;
        }
//        System.out.println(Collections.max(arr));
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
                line=i;
            }
        }
        System.out.println("max composition: "+ max+", Line: "+ line);
    }

    public void d(){
        Random r=new Random();
        int[][] mas=new int[7][10];
        System.out.println("Unsorted array");
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                mas[i][j]=-0+r.nextInt(101);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("  ");
        }
        int k=0;
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                for(int b=0;b<mas[i].length;b++){
                    if(mas[i][b]<mas[i][j]){
                        k=mas[i][b];
                        mas[i][b]=mas[i][j];
                        mas[i][j]=k;
                    }
                }
            }
        }
        System.out.println("Sorted array");
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println("  ");
        }
    }
}
