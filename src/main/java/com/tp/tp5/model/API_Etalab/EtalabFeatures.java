package com.tp.tp5.model.API_Etalab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class EtalabFeatures {
    @JsonProperty("type")
    private String type;

    @JsonProperty("geometry")
    EtalabGeometry geometry;

    @JsonProperty("properties")
    EtalabProperties properties;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public EtalabGeometry getGeometry() { return geometry; }

    public void setGeometry(EtalabGeometry geometry) { this.geometry = geometry; }

    public EtalabProperties getProperties() { return properties; }

    public void setProperties(EtalabProperties properties) { this.properties = properties; }
}
