package com.rubi;

public class Cube {

    Face[] faceArray = new Face[6];

    public Cube(Face[] _faceArray) {
        this.faceArray = _faceArray;
    }

}

enum COLOR {

    WHITE(0), GREEN(1), RED(2), BLUE(3), ORANGE(4), YELLOW(5);

    private int numVal;

    COLOR(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
}

enum TEST {

SMITHA;


}

// Assume UP is White centered, LEFT Green centered, FRONT-Red, RIGHT-Blue,BACK-Orange,DOWN-Yellow
enum SIDE {

    UP(0), LEFT(1), FRONT(2), RIGHT(3), BACK(4), DOWN(5);

    private int numVal;

    SIDE(int numVal) {
        this.numVal = numVal;
    }

    public int getNumVal() {
        return numVal;
    }
};

//L2 is 180 degree move
enum Move {
    L, LPRIME, L2,
    R, RPRIME, R2,
    U, UPRIME, U2,
    D, DPRIME, D2,
    F, FPRIME, F2,
    B, BPRIME, B2,
    Y, YPRIME, Y2,
    X, XPRIME, X2,
    Z, ZPRIME, Z2,
    M, MPRIME, M2,
    E, EPRIME, E2,
    S, SPRIME, S2
}