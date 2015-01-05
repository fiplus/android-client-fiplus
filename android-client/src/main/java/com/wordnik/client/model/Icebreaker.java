package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Icebreaker {
  @JsonProperty("activity_id")
  private String activity_id = null;
  @JsonProperty("question")
  private String question = null;
  @JsonProperty("answer")
  private String answer = null;
  public String getActivity_id() {
    return activity_id;
  }
  public void setActivity_id(String activity_id) {
    this.activity_id = activity_id;
  }

  public String getQuestion() {
    return question;
  }
  public void setQuestion(String question) {
    this.question = question;
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
    sb.append("class Icebreaker {\n");
    sb.append("  activity_id: ").append(activity_id).append("\n");
    sb.append("  question: ").append(question).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

