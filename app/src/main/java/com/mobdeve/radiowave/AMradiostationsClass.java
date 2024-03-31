package com.mobdeve.radiowave;

public class AMradiostationsClass {
    private String stationname;private String stationlink;

    public AMradiostationsClass(String stationname, String stationlink) {
        this.stationname = stationname;this.stationlink = stationlink;}

    public String getstationname() {return stationname;}
    public void setstationname(String stationname) {this.stationname = stationname;}
    public String getstationlink() {return stationlink;}
    public void setstationlink(String stationlink) {this.stationlink = stationlink;}
}
