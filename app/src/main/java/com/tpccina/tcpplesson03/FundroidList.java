package com.tpccina.tcpplesson03;

import java.util.ArrayList;

/**
 * Viewed/Created/Modified by me on 01/11/2016.
 * for the purpose of Android training
 */


public class FundroidList {
    private ArrayList<Fundroid> fundroids;

    public FundroidList() {
        fundroids = new ArrayList<>();
    }

    public void createFundroids() {
        //fundroids = new ArrayList<>();
        fundroids.add(new Fundroid(R.drawable.cupcake, "Cupcake is made for art more than just food"));
        fundroids.add(new Fundroid(R.drawable.donut, "Donut stores in many streets"));
        fundroids.add(new Fundroid(R.drawable.eclair, "Eclair is delicious"));
        fundroids.add(new Fundroid(R.drawable.froyo, "Yoghurt is good for health"));
        fundroids.add(new Fundroid(R.drawable.gingerbread, "Ginger..ginger..warm"));
        fundroids.add(new Fundroid(R.drawable.jellybean, "What for? oh, kiddy stuff"));
        //return fundroids;
    }

    public ArrayList<Fundroid> getFundroids() {
        createFundroids();
        return fundroids;
    }
}
