package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class InterestResponse {
  @JsonProperty("interests")
  private List<String> interests = new ArrayList<String>();
  public List<String> getInterests() {
    return interests;
  }
  public void setInterests(List<String> interests) {
    this.interests = interests;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestResponse {\n");
    sb.append("  interests: ").append(interests).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

