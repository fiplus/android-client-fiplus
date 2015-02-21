package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.UserProfile;
public class Favourites {
  @JsonProperty("favourite_users")
  private List<UserProfile> favourite_users = new ArrayList<UserProfile>();
  @JsonProperty("id")
  private Double id = null;
  public List<UserProfile> getFavourite_users() {
    return favourite_users;
  }
  public void setFavourite_users(List<UserProfile> favourite_users) {
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

