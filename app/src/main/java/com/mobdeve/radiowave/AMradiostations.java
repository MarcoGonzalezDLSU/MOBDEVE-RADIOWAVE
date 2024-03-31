package com.mobdeve.radiowave;

public class AMradiostations {
    private String station_name;
    private String station_link;

    public AMradiostations(String station_name, String station_link) {
        this.station_name = station_name;
        this.station_link = station_link;
    }

    public String getStation_name() {return station_name;}
    public void setStation_name(String station_name) {this.station_name = station_name;}

    public String getStation_link() {return station_link;}
    public void setStation_link(String station_link) {this.station_link = station_link;}
}