package org.example;

public class Counter {
    private int count = 0;

    public void increment() {
        try{
            Thread.sleep(100);
            } catch (InterruptedException e){
            synchronized (this){
                count++;
            }

        }

    }
    public int getCount(){
        return count;
    }
}
