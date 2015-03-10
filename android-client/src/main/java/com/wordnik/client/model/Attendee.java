package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.Joiner;
import com.wordnik.client.model.UserProfile;
public class Attendee {
  @JsonProperty("num_attendees")
  private Double num_attendees = null;
  @JsonProperty("participants")
  private List<UserProfile> participants = new ArrayList<UserProfile>();
  @JsonProperty("joiners")
  private List<Joiner> joiners = new ArrayList<Joiner>();
  @JsonProperty("id")
  private Double id = null;
  public Double getNum_attendees() {
    return num_attendees;
  }
  public void setNum_attendees(Double num_attendees) {
    this.num_attendees = num_attendees;
  }

  public List<UserProfile> getParticipants() {
    return participants;
  }
  public void setParticipants(List<UserProfile> participants) {
    this.participants = participants;
  }

  public List<Joiner> getJoiners() {
    return joiners;
  }
  public void setJoiners(List<Joiner> joiners) {
    this.joiners = joiners;
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
    sb.append("class Attendee {\n");
    sb.append("  num_attendees: ").append(num_attendees).append("\n");
    sb.append("  participants: ").append(participants).append("\n");
    sb.append("  joiners: ").append(joiners).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

