package com.gerald.stanford106a.assignment1;/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part


    @Override
    public void run() {

        do {
            putBeepersInRow();
            if (facingEast()){
                if (leftIsClear()){
                    turnLeft();
                    if (leftIsBlocked() && rightIsBlocked()){
                        putBeepersInRow();
                        break;
                    }
                    move();
                    turnLeft();
                }
            } else {
                if (rightIsClear()){
                    turnRight();
                    move();
                    turnRight();
                }
            }
        } while (frontIsClear());
    }

    private void putBeepersInRow() {
        do {
            int pointX = getLocation().x;
            int pointY = getLocation().y;
            int remainder = (pointX+pointY)%2;
            if(remainder==0){
                if(noBeepersPresent()){
                    putBeeper();
                }
            }
            if (frontIsClear()){
                move();
            }
        }while (frontIsClear());
    }
}
