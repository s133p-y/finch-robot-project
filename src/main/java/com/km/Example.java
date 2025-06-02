package com.km;

import com.birdbrain.Finch; 
public class Example{
    public static void main(String[] args){
        Finch bird = new Finch();
             bird.setMotors(-50,50);
            bird.setMove("F",10,50);
            bird.setTurn("R",90,100);
             bird.setBeak(0,100,0);
             bird.print("hello");
             bird.playNote(50,1);
             bird.setMove("B",10,50);
             bird.playNote(60,0.5);
             
        // add code here
        bird.stop();
        bird.disconnect();
    }
}