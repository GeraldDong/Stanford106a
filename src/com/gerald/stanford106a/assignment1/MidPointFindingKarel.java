package com.gerald.stanford106a.assignment1;

import stanford.karel.SuperKarel;

public class MidPointFindingKarel extends SuperKarel {


    @Override
    public void run() {
        putBeeper();
        if (frontIsClear()){
            moveToWall();

            do {
                putBeeper();
                moveToOpposite();
                move();
            } while (noBeepersPresent());

            //Karel stand in the mid
            pickAllBeepersAhead();

            turnAround();

            // let Karel go back to the mid
            backToTheMid();

            pickAllBeepersAhead();

            turnAround();
            backToTheMid();
        }
    }

    private void moveToWall() {
        while (frontIsClear()){
            move();
        }
        turnAround();
    }

    private void moveToOpposite() {
        do {
            move();
        } while (noBeepersPresent());
        turnAround();
    }

    private void backToTheMid() {
        while (noBeepersPresent()){
            move();
        }
    }

    private void pickAllBeepersAhead() {
        do {
            move();
            pickBeeper();
        } while (frontIsClear());
    }
}
