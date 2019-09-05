package com.gerald.stanford106a.assignment1;

import stanford.karel.SuperKarel;

public class StoneMasonKarel extends SuperKarel {

    @Override
    public void run() {
        do {
            repairStoneColumn();
            moveToStoneColumn();
        }while (frontIsClear());
        repairStoneColumn();
    }

    private void moveToStoneColumn() {
        for (int i=0; i<4; i++){
            move();
        }
    }

    private void repairStoneColumn() {
        turnLeft();
        do {
            if (noBeepersPresent()){
                putBeeper();
            }
            move();
        } while (frontIsClear());
        if (noBeepersPresent()){
            putBeeper();
        }
        turnAround();
        moveToWall();
        turnLeft();
    }

    private void moveToWall() {
        while (frontIsClear()){
            move();
        }
    }
}
