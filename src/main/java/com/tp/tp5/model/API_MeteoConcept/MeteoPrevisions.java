package com.tp.tp5.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MeteoPrevisions {
    @JsonProperty("day")
    private int day;

    @JsonProperty("datetime")
    private String datetime;

    @JsonProperty("wind10m")
    private int wind10m;

    @JsonProperty("gust10m")
    private int gust10m;

    @JsonProperty("dirwind10m")
    private int dirwind10m;

    @JsonProperty("rr10")
    private int rr10;

    @JsonProperty("rr1")
    private int rr1;

    @JsonProperty("probarain")
    private int probarain;

    @JsonProperty("weather")
    private int weather;

    @JsonProperty("tmin")
    private int tmin;

    @JsonProperty("tmax")
    private int tmax;

    @JsonProperty("sun_hours")
    private int sun_hours;

    @JsonProperty("etp")
    private int etp;

    @JsonProperty("probafrost")
    private int probafrost;

    @JsonProperty("probafog")
    private int probafog;

    @JsonProperty("probawind70")
    private int probawind70;

    @JsonProperty("probawind100")
    private int probawind100;

    @JsonProperty("gustx")
    private int gustx;


    /**
     * Jour entre 0 et 13 (Pour le jour même : 0, pour le lendemain : 1, etc.)
     * @return numero du jour
     */
    public int getDay() { return day; }

    public void setDay(int day) { this.day = day; }

    /**
     * Date en heure locale, format ISO8601
     * @return Date avec l'heure
     */
    public String getDatetime() { return datetime; }

    public void setDatetime(String datetime) { this.datetime = datetime; }

    /**
     * Vent moyen à 10 mètres en km/h
     * @return vent en km/h
     */
    public int getWind10m() { return wind10m; }

    public void setWind10m(int wind10m) { this.wind10m = wind10m; }

    /**
     * Rafales de vent à 10 mètres en km/h
     * @return Rafales en km/h
     */
    public int getGust10m() { return gust10m; }

    public void setGust10m(int gust10m) { this.gust10m = gust10m; }

    /**
     * Direction du vent en degrés (0 à 360°)
     * @return Direction en degrés
     */
    public int getDirwind10m() { return dirwind10m; }

    public void setDirwind10m(int dirwind10m) { this.dirwind10m = dirwind10m; }

    /**
     * Cumul de pluie sur la tranche horaire ou tri-horaire en mm
     * @return Cumul de pluie
     */
    public int getRr10() { return rr10; }

    public void setRr10(int rr10) { this.rr10 = rr10; }

    /**
     * Cumul de pluie maximal sur la tranche horaire ou tri-horaire en mm
     * @return Cumul de pluie
     */
    public int getRr1() { return rr1; }

    public void setRr1(int rr1) { this.rr1 = rr1; }

    /**
     * Probabilité de pluie entre 0 et 100%
     * @return Probabilité
     */
    public int getProbarain() { return probarain; }

    public void setProbarain(int probarain) { this.probarain = probarain; }

    /**
     * Temps sensible
     * @return Code temps
     */
    public int getWeather() { return weather; }

    public void setWeather(int weather) { this.weather = weather; }

    /**
     * Température minimale à 2 mètres en °C
     * @return Température
     */
    public int getTmin() { return tmin; }

    public void setTmin(int tmin) { this.tmin = tmin; }

    /**
     * Température maximale à 2 mètres en °C
     * @return Température
     */
    public int getTmax() { return tmax; }

    public void setTmax(int tmax) { this.tmax = tmax; }

    /**
     * Ensoleillement en heures
     * @return heures
     */
    public int getSun_hours() { return sun_hours; }

    public void setSun_hours(int sun_hours) { this.sun_hours = sun_hours; }

    /**
     * Cumul d'évapotranspiration en mm
     * @return Évapotranspiration en mm
     */
    public int getEtp() { return etp; }

    public void setEtp(int etp) { this.etp = etp; }

    /**
     * Probabilité de gel entre 0 et 100%
     * @return Probabilité
     */
    public int getProbafrost() { return probafrost; }

    public void setProbafrost(int probafrost) { this.probafrost = probafrost; }

    /**
     * Probabilité de brouillard entre 0 et 100%
     * @return Probabilité
     */
    public int getProbafog() { return probafog; }

    public void setProbafog(int probafog) { this.probafog = probafog; }

    /**
     * Probabilité de vent >70 km/h entre 0 et 100%
     * @return Probabilité
     */
    public int getProbawind70() { return probawind70; }

    public void setProbawind70(int probawind70) { this.probawind70 = probawind70; }

    /**
     * Probabilité de vent >100 km/h entre 0 et 100%
     * @return Probabilité
     */
    public int getProbawind100() { return probawind100; }

    public void setProbawind100(int probawind100) { this.probawind100 = probawind100; }

    /**
     * Rafale de vent potentielle sous orage ou grain en km/h
     * @return Rafale
     */
    public int getGustx() { return gustx; }

    public void setGustx(int gustx) { this.gustx = gustx; }


}
