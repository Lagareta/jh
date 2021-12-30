package com.tp.tp5.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MeteoEphemeride {
    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("insee")
    private String insee;

    @JsonProperty("day")
    private int day;

    @JsonProperty("datetime")
    private String datetime;

    @JsonProperty("sunrise")
    private String sunrise;

    @JsonProperty("sunset")
    private String sunset;

    @JsonProperty("duration_day")
    private String durationDay;

    @JsonProperty("diff_duration_day")
    private int diffDurationDay;

    @JsonProperty("moon_age")
    private int moonAge;

    @JsonProperty("moon_phase")
    private String moon_phase;

    public double getLatitude() { return latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getInsee() { return insee; }

    public void setInsee(String insee) { this.insee = insee; }

    public int getDay() { return day; }

    public void setDay(int day) { this.day = day; }

    public String getDatetime() { return datetime; }

    public void setDatetime(String datetime) { this.datetime = datetime; }

    public String getSunrise() { return sunrise; }

    public void setSunrise(String sunrise) { this.sunrise = sunrise; }

    public String getSunset() { return sunset; }

    public void setSunset(String sunset) { this.sunset = sunset; }

    public String getDurationDay() { return durationDay; }

    public void setDurationDay(String durationDay) { this.durationDay = durationDay; }

    public int getDiffDurationDay() { return diffDurationDay; }

    public void setDiffDurationDay(int diffDurationDay) { this.diffDurationDay = diffDurationDay; }

    public int getMoonAge() { return moonAge; }

    public void setMoonAge(int moonAge) { this.moonAge = moonAge; }

    public String getMoon_phase() { return moon_phase; }

    public void setMoon_phase(String moon_phase) { this.moon_phase = moon_phase; }


}
