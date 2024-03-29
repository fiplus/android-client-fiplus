package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credentials {
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("password")
  private String password = null;
  @JsonProperty("id")
  private Double id = null;
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
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
    sb.append("class Credentials {\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

