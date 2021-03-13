package com.argen;

public class Weapon {


    private String rifle;
    private String steelArms;
    private String houseHold;

    public String getRifle() {
        return rifle;
    }

    public void setRifle(String rifle) {
        this.rifle = rifle;
    }

    public String getSteelArms() {
        return steelArms;
    }

    public void setSteelArms(String steelArms) {
        this.steelArms = steelArms;
    }

    public String getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(String houseHold) {
        this.houseHold = houseHold;
    }

    public Weapon(String rifle, String steelArms, String houseHold) {
        this.rifle = rifle;
        this.steelArms = steelArms;
        this.houseHold = houseHold;

    }
}
