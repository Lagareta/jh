package com.tp.tp5.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MeteoCity {
    @JsonProperty("insee")
    private String insee;

    @JsonProperty("cp")
    private String cp;

    @JsonProperty("name")
    private String name;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("altitude")
    private int altitude;


    public String getInsee() { return insee; }

    public void setInsee(String insee) { this.insee = insee; }


    public String getCp() { return cp; }

    public void setCp(String cp) { this.cp = cp; }


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }


    public double getLatitude() { return latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }


    public double getLongitude() { return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }


    public int getAltitude() { return altitude; }

    public void setAltitude(int altitude) { this.altitude = altitude; }


}
