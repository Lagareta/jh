package com.tp.tp5.model.API_Etalab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)

public class EtalabGeometry {
    @JsonProperty("type")
    private String type;

    @JsonProperty("coordinates")
    ArrayList<Double> coordinates = new ArrayList();

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public ArrayList<Double> getCoordinates() { return coordinates; }

    public void setCoordinates(ArrayList<Double> coordinates) { this.coordinates = coordinates; }
}
