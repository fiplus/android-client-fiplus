package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.ActivityDetailResponse;
public class ActivitiesResponse {
  @JsonProperty("activities")
  private List<ActivityDetailResponse> activities = new ArrayList<ActivityDetailResponse>();
  public List<ActivityDetailResponse> getActivities() {
    return activities;
  }
  public void setActivities(List<ActivityDetailResponse> activities) {
    this.activities = activities;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivitiesResponse {\n");
    sb.append("  activities: ").append(activities).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

