package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
  @JsonProperty("activity_id")
  private String activity_id = null;
  @JsonProperty("user_id")
  private String user_id = null;
  @JsonProperty("answer")
  private String answer = null;
  public String getActivity_id() {
    return activity_id;
  }
  public void setActivity_id(String activity_id) {
    this.activity_id = activity_id;
  }

  public String getUser_id() {
    return user_id;
  }
  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }

  public String getAnswer() {
    return answer;
  }
  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    sb.append("  activity_id: ").append(activity_id).append("\n");
    sb.append("  user_id: ").append(user_id).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

