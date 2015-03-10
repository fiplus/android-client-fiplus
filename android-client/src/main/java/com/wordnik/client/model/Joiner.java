package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joiner {
  @JsonProperty("joiner_id")
  private String joiner_id = null;
  @JsonProperty("confirmed")
  private Boolean confirmed = null;
  @JsonProperty("id")
  private Double id = null;
  public String getJoiner_id() {
    return joiner_id;
  }
  public void setJoiner_id(String joiner_id) {
    this.joiner_id = joiner_id;
  }

  public Boolean getConfirmed() {
    return confirmed;
  }
  public void setConfirmed(Boolean confirmed) {
    this.confirmed = confirmed;
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
    sb.append("class Joiner {\n");
    sb.append("  joiner_id: ").append(joiner_id).append("\n");
    sb.append("  confirmed: ").append(confirmed).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

