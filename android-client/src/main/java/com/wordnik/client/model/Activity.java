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
  @JsonProperty("creator")
  private String creator = null;
  @JsonProperty("tagged_interests")
  private List<String> tagged_interests = new ArrayList<String>();
  @JsonProperty("suggested_times")
  private List<Time> suggested_times = new ArrayList<Time>();
  @JsonProperty("suggested_locations")
  private List<Location> suggested_locations = new ArrayList<Location>();
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

  public List<Time> getSuggested_times() {
    return suggested_times;
  }
  public void setSuggested_times(List<Time> suggested_times) {
    this.suggested_times = suggested_times;
  }

  public List<Location> getSuggested_locations() {
    return suggested_locations;
  }
  public void setSuggested_locations(List<Location> suggested_locations) {
    this.suggested_locations = suggested_locations;
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
    sb.append("  creator: ").append(creator).append("\n");
    sb.append("  tagged_interests: ").append(tagged_interests).append("\n");
    sb.append("  suggested_times: ").append(suggested_times).append("\n");
    sb.append("  suggested_locations: ").append(suggested_locations).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

