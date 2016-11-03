package com.tpccina.tcpplesson03;

/**
 * Viewed/Created/Modified by me on 01/11/2016.
 * for the purpose of Android training
 */

public class Fundroid {
    private int droidId;
    private String featureText;

    public Fundroid(int droidId, String featureText) {
        this.droidId = droidId;
        this.featureText = featureText;
    }

    public void setDroidId(int droidId) {
        this.droidId = droidId;
    }

    public void setFeatureText(String featureText) {
        this.featureText = featureText;
    }

    public int getDroidId() {
        return droidId;
    }

    public String getFeatureText() {
        return featureText;
    }
}
