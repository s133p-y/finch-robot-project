package com.km;

import com.birdbrain.Finch; 
public class FinalDance{
    public static void main(String[] args){
        Finch bird = new Finch();
     //2D array including each color listed in the program
        int[][] colors = {
            {3,255,13,53},
            {1,0,255,255},
            {2,255,0,127},
            {1,0,255,128},
            {4,255,255,0},
        };

        int [][] color = {
          {11,11,192},
          {127,0,255},
          {11,11,192},
          {127,0,255},
          {11,11,192},
          {127,0,255},
          {11,11,192},
          {11,11,192}

        }

    

   // declares methods
start(bird, colors);
middle (bird, colors);
end (bird, colors);

           

        //bird completes program
        bird.stop();
        bird.disconnect();
    }
//start method that makes the bird move first
    public static void start(Finch bird, int [][] colors){
                    bird.setMotors(-50,50);
            bird.setMove("F",10,50);
            bird.setTurn("R",90,100);
             bird.setBeak(11,11,192);
             bird.playNote(55,2);
             bird.print("DANCE!");
              bird.setBeak(127,0,255);
             bird.playNote(80,2);
              bird.setTail(3,255,13,53);
    }
//middle method that makes the bird move in between the beginning and end
    public static void middle (Finch bird, int [][] colors){
bird.setMove("B",10,50);
              bird.setTail(1,0,255,255);
             bird.playNote(47,2);
             bird.setBeak(11,11,192);
              bird.setMove("F",10,50);
              bird.setTail(2,255,0,127);
             bird.playNote(92,2);
              bird.setBeak(127,0,255);
             bird.playNote(60,2);
    }
    //end method that gives the finch its final movements
    public static void end (Finch bird, int [][] colors){
             bird.setTurn("R",90,100);
              bird.setTail(1,0,255,128);
             bird.playNote(67,2);
             bird.setBeak(11,11,192);
              bird.setTail(4,255,255,0);
             bird.setTurn("L",90,100);
             bird.playNote(73,2);
              bird.setBeak(11,11,192);
             bird.setTurn("R",90,100);
             
    }
}