package org.example;

public class App{
    public static void main(String[] args){
        int[] numsA = {1, 2, 3, 4, 5, 6, 7};
        int[] numsB = {8, 23, 10, 11, 12, 13, 3};

        var th1 = new Tarea(numsA);
        var th2 = new Tarea(numsB);
        th1.start();
        th2.start();
        System.out.printf(
                "En numsA hay %d primos, mientras que en numsB hay %d %n",
            th1.getResult(),
            th2.getResult()
        );


    }
}
