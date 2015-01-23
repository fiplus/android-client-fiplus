package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class Attendee {
  @JsonProperty("num_attendees")
  private Double num_attendees = null;
  @JsonProperty("participants")
  private List<String> participants = new ArrayList<String>();
  @JsonProperty("joiners")
  private List<String> joiners = new ArrayList<String>();
  @JsonProperty("id")
  private Double id = null;
  public Double getNum_attendees() {
    return num_attendees;
  }
  public void setNum_attendees(Double num_attendees) {
    this.num_attendees = num_attendees;
  }

  public List<String> getParticipants() {
    return participants;
  }
  public void setParticipants(List<String> participants) {
    this.participants = participants;
  }

  public List<String> getJoiners() {
    return joiners;
  }
  public void setJoiners(List<String> joiners) {
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

