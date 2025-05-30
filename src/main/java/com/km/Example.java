package com.kr;

import com.birdbrain.Finch; 
public class Example{
    public static void main(String[] args){
        Finch bird = new Finch();
        setMotors(double leftSpeed, double rightSpeed){
             bird.setMotors(-50,50);
        }
        // add code here
        bird.stop();
        bird.disconnect();
    }
}