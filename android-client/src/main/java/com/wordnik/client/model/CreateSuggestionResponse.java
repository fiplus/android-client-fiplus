package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSuggestionResponse {
  @JsonProperty("suggestion_id")
  private String suggestion_id = null;
  @JsonProperty("id")
  private Double id = null;
  public String getSuggestion_id() {
    return suggestion_id;
  }
  public void setSuggestion_id(String suggestion_id) {
    this.suggestion_id = suggestion_id;
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
    sb.append("class CreateSuggestionResponse {\n");
    sb.append("  suggestion_id: ").append(suggestion_id).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

