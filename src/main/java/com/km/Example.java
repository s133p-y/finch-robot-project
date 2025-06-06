package com.km;

import com.birdbrain.Finch; 
public class Example{
    public static void main(String[] args){
        Finch bird = new Finch();
             bird.setMotors(-50,50);
            bird.setMove("F",10,50);
            bird.setTurn("R",90,100);
             bird.setBeak(11,11,192);
             bird.playNote(55,2);
             bird.print("DANCE!");
              bird.setBeak(127,0,255);
             bird.playNote(80,2);
              bird.setTail(3,255,13,53);
             bird.setMove("B",10,50);
              bird.setTail(1,0,255,255);
             bird.playNote(47,2);
             bird.setBeak(11,11,192);
              bird.setMove("F",10,50);
              bird.setTail(2,255,0,127);
             bird.playNote(92,2);
              bird.setBeak(127,0,255);
             bird.playNote(60,2);
             bird.setTurn("R",90,100);
              bird.setTail(1,0,255,128);
             bird.playNote(67,2);
             bird.setBeak(11,11,192);
              bird.setTail(4,255,255,0);
             bird.setTurn("L",90,100);
             bird.playNote(73,2);
              bird.setBeak(127,0,255);
             bird.setTurn("R",90,100);
             
        // add code here
        bird.stop();
        bird.disconnect();
    }
}