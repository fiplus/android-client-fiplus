package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WhoAmI {
  @JsonProperty("user_id")
  private String user_id = null;
  @JsonProperty("id")
  private Double id = null;
  public String getUser_id() {
    return user_id;
  }
  public void setUser_id(String user_id) {
    this.user_id = user_id;
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
    sb.append("class WhoAmI {\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

