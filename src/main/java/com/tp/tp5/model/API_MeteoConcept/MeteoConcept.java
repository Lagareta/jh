package com.tp.tp5.model.API_MeteoConcept;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class MeteoConcept {

    @JsonProperty("city")
    private MeteoCity city;

    @JsonProperty("update")
    private String update;

    @JsonProperty("forecast")
    private ArrayList<MeteoPrevisions> previsions;

    /**
     * Informations sur la commune
     * @return Objet ville
     */
    public MeteoCity getCity() { return city; }

    public void setCity(MeteoCity city) { this.city = city; }

    /**
     * associée à une chaîne de caractère donnant la date de la prévision
     * @return date de la prévision (au format ISO8601)
     */
    public String getUpdate() { return update; }

    public void setUpdate(String update) { this.update = update; }

    /**
     * Détail de la prévision météo par période et par jour
     * @return collections de prévision météo
     */
    public ArrayList<MeteoPrevisions> getPrevisions() { return previsions; }

    public void setPrevisions(ArrayList<MeteoPrevisions> previsions) { this.previsions = previsions; }


}
