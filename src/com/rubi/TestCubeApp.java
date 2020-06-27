package com.rubi;

public class TestCubeApp {

    public static void main(String[] args) {
        // TODO
        //1.Construct and initialize the rubix cube with correct faces;
        //2.Scramble the cube
        //3.get current state and Store the pattern of 6 faces
        //4.Get the possible moves to correct the cubes position from database which has all the possible combination of faces
        //and moves required to solve that state.


        //6 colours
        Face[] face = new Face[6];

        Sticker[][] stickers_face0 = new Sticker[3][3];
        //face0 is white face or UP side

        /*
           W W W
           W w W
           W W W
         */
        //top row
        stickers_face0[0][0] = new Sticker(COLOR.WHITE);
        stickers_face0[0][1] = new Sticker(COLOR.WHITE);
        stickers_face0[0][2] = new Sticker(COLOR.WHITE);

        //middle row
        stickers_face0[1][0] = new Sticker(COLOR.WHITE);
        stickers_face0[1][1] = new Sticker(COLOR.WHITE);
        stickers_face0[1][2] = new Sticker(COLOR.WHITE);

        //bottom row
        stickers_face0[2][0] = new Sticker(COLOR.WHITE);
        stickers_face0[2][1] = new Sticker(COLOR.WHITE);
        stickers_face0[2][2] = new Sticker(COLOR.WHITE);


        face[SIDE.UP.getNumVal()] = new Face(SIDE.UP, stickers_face0);

        //Similarly initialize all faces
        /*
         * G G G
         * G G G
         * G G G
         * */

        Sticker[][] stickers_face1 = new Sticker[8][];//GREEN
        Sticker[][] stickers_face2 = new Sticker[8][];//RED
        Sticker[][] stickers_face3 = new Sticker[8][];//BLUE
        Sticker[][] stickers_face4 = new Sticker[8][];//ORANGE
        Sticker[][] stickers_face5 = new Sticker[8][];//YELLOW

        face[SIDE.LEFT.getNumVal()] = new Face(SIDE.LEFT, stickers_face1);
        face[SIDE.FRONT.getNumVal()] = new Face(SIDE.FRONT,stickers_face2);
        face[SIDE.RIGHT.getNumVal()] = new Face(SIDE.RIGHT,stickers_face3);
        face[SIDE.BACK.getNumVal()] = new Face(SIDE.BACK,stickers_face4);
        face[SIDE.DOWN.getNumVal()] = new Face(SIDE.DOWN,stickers_face5);

        //initialize rubix cube
        Cube cube = new Cube(face);

        CubeSolver.printCube();

        CubeSolver.shuffle();

        CubeSolver.solve(cube);

        System.out.println("\n\n After U\n\n");

        CubeSolver.printCube();

        boolean result = CubeSolver.isSolved();

        System.out.println("\n\n Solved: " + result + "\n\n");
    }

}

