package com.tp.tp5.model.API_Etalab;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class EtalabProperties {
    @JsonProperty("label")
    private String label;

    @JsonProperty("score")
    private double score;

    @JsonProperty("housenumber")
    private String housenumber;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("x")
    private float x;

    @JsonProperty("y")
    private float y;

    @JsonProperty("importance")
    private float importance;

    @JsonProperty("name")
    private String name;

    @JsonProperty("postcode")
    private String postcode;

    @JsonProperty("citycode")
    private String citycode;

    @JsonProperty("city")
    private String city;

    @JsonProperty("context")
    private String context;

    @JsonProperty("street")
    private String street;

    public String getLabel() { return label; }

    public void setLabel(String label) { this.label = label; }

    public double getScore() { return score; }

    public void setScore(double score) { this.score = score; }

    public String getHousenumber() { return housenumber; }

    public void setHousenumber(String housenumber) { this.housenumber = housenumber; }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public float getX() { return x; }

    public void setX(float x) { this.x = x; }

    public float getY() { return y; }

    public void setY(float y) { this.y = y; }

    public float getImportance() { return importance; }

    public void setImportance(float importance) { this.importance = importance; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPostcode() { return postcode; }

    public void setPostcode(String postcode) { this.postcode = postcode; }

    public String getCitycode() { return citycode; }

    public void setCitycode(String citycode) { this.citycode = citycode; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getContext() { return context; }

    public void setContext(String context) { this.context = context; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }
}
