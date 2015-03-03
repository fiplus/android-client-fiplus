package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class Location {
  @JsonProperty("location_id")
  private String location_id = null;
  @JsonProperty("suggestion_id")
  private String suggestion_id = null;
  @JsonProperty("suggestion_votes")
  private Double suggestion_votes = null;
  @JsonProperty("suggestion_voters")
  private List<String> suggestion_voters = new ArrayList<String>();
  @JsonProperty("latitude")
  private Double latitude = null;
  @JsonProperty("longitude")
  private Double longitude = null;
  @JsonProperty("id")
  private Double id = null;
  public String getLocation_id() {
    return location_id;
  }
  public void setLocation_id(String location_id) {
    this.location_id = location_id;
  }

  public String getSuggestion_id() {
    return suggestion_id;
  }
  public void setSuggestion_id(String suggestion_id) {
    this.suggestion_id = suggestion_id;
  }

  public Double getSuggestion_votes() {
    return suggestion_votes;
  }
  public void setSuggestion_votes(Double suggestion_votes) {
    this.suggestion_votes = suggestion_votes;
  }

  public List<String> getSuggestion_voters() {
    return suggestion_voters;
  }
  public void setSuggestion_voters(List<String> suggestion_voters) {
    this.suggestion_voters = suggestion_voters;
  }

  public Double getLatitude() {
    return latitude;
  }
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("  location_id: ").append(location_id).append("\n");
    sb.append("  suggestion_id: ").append(suggestion_id).append("\n");
    sb.append("  suggestion_votes: ").append(suggestion_votes).append("\n");
    sb.append("  suggestion_voters: ").append(suggestion_voters).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

