package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Location {
  @JsonProperty("latitude")
  private Long latitude = null;
  @JsonProperty("longitude")
  private Long longitude = null;
  public Long getLatitude() {
    return latitude;
  }
  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }

  public Long getLongitude() {
    return longitude;
  }
  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

