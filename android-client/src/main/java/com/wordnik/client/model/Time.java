package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {
  @JsonProperty("time_id")
  private String time_id = null;
  @JsonProperty("suggestion_id")
  private String suggestion_id = null;
  @JsonProperty("suggestion_votes")
  private Double suggestion_votes = null;
  @JsonProperty("start")
  private Double start = null;
  @JsonProperty("end")
  private Double end = null;
  @JsonProperty("id")
  private Double id = null;
  public String getTime_id() {
    return time_id;
  }
  public void setTime_id(String time_id) {
    this.time_id = time_id;
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
    sb.append("  time_id: ").append(time_id).append("\n");
    sb.append("  suggestion_id: ").append(suggestion_id).append("\n");
    sb.append("  suggestion_votes: ").append(suggestion_votes).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

