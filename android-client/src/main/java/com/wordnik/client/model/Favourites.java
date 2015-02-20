package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class Favourites {
  @JsonProperty("favourite_users")
  private List<String> favourite_users = new ArrayList<String>();
  @JsonProperty("id")
  private Double id = null;
  public List<String> getFavourite_users() {
    return favourite_users;
  }
  public void setFavourite_users(List<String> favourite_users) {
    this.favourite_users = favourite_users;
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
    sb.append("class Favourites {\n");
    sb.append("  favourite_users: ").append(favourite_users).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

