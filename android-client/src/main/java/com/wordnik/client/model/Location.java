package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
  @JsonProperty("activity_id")
  private String activity_id = null;
  @JsonProperty("latitude")
  private Float latitude = null;
  @JsonProperty("longitude")
  private Float longitude = null;
  public String getActivity_id() {
    return activity_id;
  }
  public void setActivity_id(String activity_id) {
    this.activity_id = activity_id;
  }

  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("  activity_id: ").append(activity_id).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

