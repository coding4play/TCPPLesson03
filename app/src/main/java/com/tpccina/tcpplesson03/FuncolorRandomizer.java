package com.tpccina.tcpplesson03;

import android.graphics.Color;

import java.util.Random;

/**
 * Viewed/Created/Modified by me on 01/11/2016.
 * for the purpose of Android training
 */

public class FuncolorRandomizer {
    private Funcolor[] funcolors;
    private Funcolor funcolor;
    private int colorId;

    public FuncolorRandomizer() {
        this.funcolors = new Funcolor[6];
        this.funcolor = null;
        this.colorId = 0;
    }

    public int getLength() {
        return funcolors.length;
    }

    public void createFuncolors() {
        funcolors = new Funcolor[] {
                                        new Funcolor(Color.BLUE),
                                        new Funcolor(Color.CYAN),
                                        new Funcolor(Color.GREEN),
                                        new Funcolor(Color.MAGENTA),
                                        new Funcolor(Color.RED),
                                        new Funcolor(Color.YELLOW)
                    };
        Random colorGenerator = new Random();
        int randomColor = colorGenerator.nextInt(getLength());
        funcolor = funcolors[randomColor];
    }

    public int getFuncolorId() {
        createFuncolors();
        return funcolor.getColorId();
    }
}
