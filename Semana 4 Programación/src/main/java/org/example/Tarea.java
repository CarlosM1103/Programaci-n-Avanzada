package org.example;

public class Tarea extends Thread{
    private int[] nums;
    private int result;

    public Tarea(int[] nums){
        this.nums = nums;
    }

    @Override
    public void run(){
        //Contar cuantos primos hay en nums


        for(var num: nums){
            var isPrime = true;
            for(var i = 2; i < num; i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                result ++;
            }
        }
    }

    public void setNums(int[] nums){
        this.nums = nums;
    }

    public int getResult(){
        return result;
    }

}

