package com.gerald.stanford106a.assignment1;

import stanford.karel.SuperKarel;

public class CollectNewspaperKarel extends SuperKarel {

    @Override
    public void run() {
        moveToNewspaper();
        pickBeeper();
        returnToStartingPoint();
    }

    private void returnToStartingPoint() {
        turnAround();
        move();
        turnRight();
        moveToWall();
        turnLeft();
        moveToWall();
        turnAround();
    }

    private void moveToNewspaper() {
        moveToWall();
        turnRight();
        do {
            move();
        }while (leftIsBlocked());
        turnLeft();
        move();
    }

    private void moveToWall() {
        while (frontIsClear()){
            move();
        }
    }


}
