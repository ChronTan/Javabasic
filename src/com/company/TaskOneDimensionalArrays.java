package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TaskOneDimensionalArrays {

    public static void main(String[] args) {
        TaskOneDimensionalArrays t=new TaskOneDimensionalArrays();
        System.out.println("Создать массив нечётных чисел от 1 до 99 и вывести их в порядке возрастания и убывания");
        t.a();
        System.out.println("!------------------------------!");
        System.out.println("Создать массив из 20 случайных чисел лежащих в отрезке [0;10]. Вывести массив на экран.\n" +
                "Подсчитать и вывести на экран количество чётных и нечётных элементов в массиве.\n");
        t.b();
        System.out.println("!------------------------------!");
        System.out.println("Создайте массив из 10 случайных целых чисел на  отрезке [1;100]. " +"\n"+
                "Выведите массив на экран в строку." +"\n"+
                "Замените каждый элемент с нечётным индексом на ноль. Выведите новый результат на экран.");
        t.c();
        System.out.println("!------------------------------!");
        System.out.println("Создайте массив из 15 случайных целых чисел из отрезка [-50;50]." +"\n"+
                "Найдите максимальный и минимальный элемент массива. " +"\n"+
                "Выведите их значения на экран и также индекс последнего вхождения элемента в массив.");
        t.d();
        System.out.println("!------------------------------!");
        System.out.println("Создайте два  массива из 10 случайных целых чисел в отрезке [0;10]." +"\n"+
                "выведите массивы. Вычислите среднее арифметическое элементов каждого массива и сообщите," +"\n"+
                "для какого из массивов это значение оказалось больше (либо сообщите, что они равны).");
        t.e();
        System.out.println("!------------------------------!");
        System.out.println("Создайте массив из 20 случайных целых чисел в отрезке [-1;1]." +"\n"+
                "Определите какой элемент встречается в массиве чаще всего и выведите его на экран. " +"\n"+
                "Также если несколько элементов встречаются одинаковое количество раз, необходимо их вывести на экран.");
        t.f();
        System.out.println("!------------------------------!");
    }


    public void a(){                               //Create an array of odd numbers from 1 to 99
       ArrayList<Integer> mas=new ArrayList<>();   // and display them in ascending and descending order
       int k=0;
        for(int i=1;i<100;i++){
           if(i%2!=0){
               mas.add(i);
               k++;
           }
       }
        for(int i=0;i<mas.size();i++){
            System.out.print(mas.get(i)+" ");
        }
        System.out.println("");
        for(int i=mas.size()-1;i>=0;i--){
            System.out.print(mas.get(i)+" ");
        }
        System.out.println("");
    }

    public void b(){                                 //Create an array of 20 random numbers lying in a segment [0;10].
        Random r=new Random();                       //Display the array on the screen.
        int[] mas=new int[20];
        int even=0;
        int uneven=0;
        for(int i=0;i<mas.length;i++){
            mas[i]=0+r.nextInt(11);
        }
        for(int i=0;i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
        for(int i=0;i<mas.length;i++){
            if(mas[i]%2!=0){
                uneven++;
            }else{
                even++;
            }
        }
        System.out.println("");
        System.out.println("Even: "+ even);
        System.out.println("Uneven: "+ uneven);
    }

    public void c(){                               // create an array and replace with an odd index by 0
        Random r=new Random();
        int[] mas=new int[10];
        String strOld="";
        String strNew="";
        for(int i=0;i<mas.length;i++){
            mas[i]=1+r.nextInt(101);
            strOld+=mas[i]+ " ";
        }
        System.out.println("Str old:"+ strOld);
        for(int i=0;i<mas.length;i++){
            if(i%2!=0){
                mas[i]=0;
            }
            strNew+=mas[i]+ " ";
        }
        System.out.println("Str New:"+ strNew);
    }

    public void d(){                               // find the maximum and minimum and print their indexes
        Random r=new Random();
        int[] mas=new int[15];
        int max=-52;
        int min=52;
        int indexMax=-1;
        int indexMin=-1;
        for(int i=0;i<mas.length;i++){
            mas[i]=-50+r.nextInt(101);
        }
        for(int i=0;i<mas.length;i++){
            if(mas[i]>max){
                max=mas[i];
                indexMax=i;
            }
            if(mas[i]<min){
                min=mas[i];
                indexMin=i;
            }
        }
        for(int i=0;i<mas.length;i++){
            System.out.print(mas[i]+" ");
        }
        System.out.println("");
        System.out.println("maxElement: "+ max+",his index: "+ indexMax);
        System.out.println("minElement: "+ min+",his index: "+ indexMin);
    }

    public void e(){                               // create an array and replace with an odd index by 0
        Random r=new Random();
        int[] mas=new int[10];
        int[] mas2=new int[10];
        int avgMas1=0;
        int avgMas2=0;
        for(int i=0;i<mas.length;i++){
            mas[i]=r.nextInt(11);
            mas2[i]=r.nextInt(11);
        }
        for(int i=0;i<mas.length;i++){
            avgMas1+=mas[i];
            System.out.print(mas[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<mas2.length;i++){
            avgMas2+=mas2[i];
            System.out.print(mas2[i]+" ");
        }
        avgMas1=avgMas1/mas.length;
        avgMas2=avgMas2/mas2.length;
        System.out.println("");
        System.out.println("avg first:"+ avgMas1);
        System.out.println("avg second:"+ avgMas2);
        if(avgMas1>avgMas2){
            System.out.println("avg array first more avg second");
        }else{
            if(avgMas1==avgMas2){
                System.out.println("arithmetic mean equal");
            }else{
                System.out.println("avg array second more avg first");
            }
        }
    }

    public void f(){                               // count how many times a unique number occurs
        Random r=new Random();
        int[] mas=new int[20];
        int[] mas2=new int[20];
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<mas.length;i++){
            mas[i]=-1+r.nextInt(3);
            mas2[i]=-1+r.nextInt(3);
        }
        for(int i=0;i<mas.length;i++){
            if(!arr.contains(mas[i]))
                arr.add(mas[i]);
            System.out.print(mas[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<mas2.length;i++){
            if(!arr2.contains(mas2[i]))
                arr2.add(mas2[i]);
            System.out.print(mas2[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<mas.length;j++){
                if(arr.get(i)==mas[j])
                    count++;
            }
            System.out.println(arr.get(i)+" meets "+ count +" groove"+ "  ");
            System.out.print("");
            count=0;
        }
        System.out.println("------------------");
        for(int i=0;i<arr2.size();i++){
            for(int j=0;j<mas2.length;j++){
                if(arr2.get(i)==mas2[j])
                    count++;
            }
            System.out.println(arr2.get(i)+" meets "+ count +" groove"+ "  ");
            count=0;
        }
    }
}
