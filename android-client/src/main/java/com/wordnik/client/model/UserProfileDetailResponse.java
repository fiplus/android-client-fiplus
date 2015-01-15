package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
public class UserProfileDetailResponse {
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("profile_pic")
  private String profile_pic = null;
  @JsonProperty("age")
  private Integer age = null;
  @JsonProperty("gender")
  private String gender = null;
  @JsonProperty("latitude")
  private Long latitude = null;
  @JsonProperty("longitude")
  private Long longitude = null;
  @JsonProperty("location_proximity_setting")
  private Boolean location_proximity_setting = null;
  @JsonProperty("availabilities")
  private List<Time> availabilities = new ArrayList<Time>();
  @JsonProperty("tagged_interests")
  private List<String> tagged_interests = new ArrayList<String>();
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getProfile_pic() {
    return profile_pic;
  }
  public void setProfile_pic(String profile_pic) {
    this.profile_pic = profile_pic;
  }

  public Integer getAge() {
    return age;
  }
  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  public Long getLatitude() {
    return latitude;
  }
  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }

  public Long getLongitude() {
    return longitude;
  }
  public void setLongitude(Long longitude) {
    this.longitude = longitude;
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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileDetailResponse {\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  profile_pic: ").append(profile_pic).append("\n");
    sb.append("  age: ").append(age).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  location_proximity_setting: ").append(location_proximity_setting).append("\n");
    sb.append("  availabilities: ").append(availabilities).append("\n");
    sb.append("  tagged_interests: ").append(tagged_interests).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

