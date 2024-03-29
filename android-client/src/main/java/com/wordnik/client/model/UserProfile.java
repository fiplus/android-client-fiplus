package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.Location;
import com.wordnik.client.model.Time;
public class UserProfile {
  @JsonProperty("user_id")
  private String user_id = null;
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("profile_pic")
  private String profile_pic = null;
  @JsonProperty("favourited")
  private Boolean favourited = null;
  @JsonProperty("age")
  private Double age = null;
  @JsonProperty("gender")
  private String gender = null;
  @JsonProperty("location")
  private Location location = null;
  @JsonProperty("location_proximity_setting")
  private Boolean location_proximity_setting = null;
  @JsonProperty("availabilities")
  private List<Time> availabilities = new ArrayList<Time>();
  @JsonProperty("tagged_interests")
  private List<String> tagged_interests = new ArrayList<String>();
  @JsonProperty("id")
  private Double id = null;
  public String getUser_id() {
    return user_id;
  }
  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getProfile_pic() {
    return profile_pic;
  }
  public void setProfile_pic(String profile_pic) {
    this.profile_pic = profile_pic;
  }

  public Boolean getFavourited() {
    return favourited;
  }
  public void setFavourited(Boolean favourited) {
    this.favourited = favourited;
  }

  public Double getAge() {
    return age;
  }
  public void setAge(Double age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  public Location getLocation() {
    return location;
  }
  public void setLocation(Location location) {
    this.location = location;
  }

  public Boolean getLocation_proximity_setting() {
    return location_proximity_setting;
  }
  public void setLocation_proximity_setting(Boolean location_proximity_setting) {
    this.location_proximity_setting = location_proximity_setting;
  }

  public List<Time> getAvailabilities() {
    return availabilities;
  }
  public void setAvailabilities(List<Time> availabilities) {
    this.availabilities = availabilities;
  }

  public List<String> getTagged_interests() {
    return tagged_interests;
  }
  public void setTagged_interests(List<String> tagged_interests) {
    this.tagged_interests = tagged_interests;
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
    sb.append("class UserProfile {\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  profile_pic: ").append(profile_pic).append("\n");
    sb.append("  favourited: ").append(favourited).append("\n");
    sb.append("  age: ").append(age).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  location: ").append(location).append("\n");
    sb.append("  location_proximity_setting: ").append(location_proximity_setting).append("\n");
    sb.append("  availabilities: ").append(availabilities).append("\n");
    sb.append("  tagged_interests: ").append(tagged_interests).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

