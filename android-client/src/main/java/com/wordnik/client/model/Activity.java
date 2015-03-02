package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.Location;
import com.wordnik.client.model.Time;
public class Activity {
  @JsonProperty("activity_id")
  private String activity_id = null;
  @JsonProperty("Name")
  private String Name = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("max_attendees")
  private Double max_attendees = null;
  @JsonProperty("allow_joiner_input")
  private Boolean allow_joiner_input = null;
  @JsonProperty("num_attendees")
  private Double num_attendees = null;
  @JsonProperty("creator")
  private String creator = null;
  @JsonProperty("tagged_interests")
  private List<String> tagged_interests = new ArrayList<String>();
  @JsonProperty("times")
  private List<Time> times = new ArrayList<Time>();
  @JsonProperty("locations")
  private List<Location> locations = new ArrayList<Location>();
  @JsonProperty("is_cancelled")
  private Boolean is_cancelled = null;
  @JsonProperty("id")
  private Double id = null;
  public String getActivity_id() {
    return activity_id;
  }
  public void setActivity_id(String activity_id) {
    this.activity_id = activity_id;
  }

  public String getName() {
    return Name;
  }
  public void setName(String Name) {
    this.Name = Name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public Double getMax_attendees() {
    return max_attendees;
  }
  public void setMax_attendees(Double max_attendees) {
    this.max_attendees = max_attendees;
  }

  public Boolean getAllow_joiner_input() {
    return allow_joiner_input;
  }
  public void setAllow_joiner_input(Boolean allow_joiner_input) {
    this.allow_joiner_input = allow_joiner_input;
  }

  public Double getNum_attendees() {
    return num_attendees;
  }
  public void setNum_attendees(Double num_attendees) {
    this.num_attendees = num_attendees;
  }

  public String getCreator() {
    return creator;
  }
  public void setCreator(String creator) {
    this.creator = creator;
  }

  public List<String> getTagged_interests() {
    return tagged_interests;
  }
  public void setTagged_interests(List<String> tagged_interests) {
    this.tagged_interests = tagged_interests;
  }

  public List<Time> getTimes() {
    return times;
  }
  public void setTimes(List<Time> times) {
    this.times = times;
  }

  public List<Location> getLocations() {
    return locations;
  }
  public void setLocations(List<Location> locations) {
    this.locations = locations;
  }

  public Boolean getIs_cancelled() {
    return is_cancelled;
  }
  public void setIs_cancelled(Boolean is_cancelled) {
    this.is_cancelled = is_cancelled;
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
    sb.append("class Activity {\n");
    sb.append("  activity_id: ").append(activity_id).append("\n");
    sb.append("  Name: ").append(Name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  max_attendees: ").append(max_attendees).append("\n");
    sb.append("  allow_joiner_input: ").append(allow_joiner_input).append("\n");
    sb.append("  num_attendees: ").append(num_attendees).append("\n");
    sb.append("  creator: ").append(creator).append("\n");
    sb.append("  tagged_interests: ").append(tagged_interests).append("\n");
    sb.append("  times: ").append(times).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  is_cancelled: ").append(is_cancelled).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

