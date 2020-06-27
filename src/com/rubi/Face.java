package com.rubi;

/*
 * A cube has 6 faces and each face have 9 sticker(color).
 * I am representing each sticker position in a 2D array.
 *
 * UP face as
 *   0 1 2
 * 0 W W W
 * 1 W W W
 * 2 W W W

 * */
public class Face {

    SIDE faceName;
    int dim = 3;

    Sticker[][] stickerPosition = new Sticker[dim][dim];

    public Face(SIDE faceName, Sticker[][] stickerPosition) {
        this.faceName = faceName;

        //considering center Sticker color as the face name
        Sticker centerSticker = stickerPosition[1][1];
        if (faceName.getNumVal() != centerSticker.color.getNumVal()) {
        //then it is wrong initialization, throw exception do not initialize Face
        }

    }
}

