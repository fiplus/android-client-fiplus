package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {
  @JsonProperty("start")
  private Double start = null;
  @JsonProperty("end")
  private Double end = null;
  @JsonProperty("id")
  private Double id = null;
  public Double getStart() {
    return start;
  }
  public void setStart(Double start) {
    this.start = start;
  }

  public Double getEnd() {
    return end;
  }
  public void setEnd(Double end) {
    this.end = end;
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
    sb.append("class Time {\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

