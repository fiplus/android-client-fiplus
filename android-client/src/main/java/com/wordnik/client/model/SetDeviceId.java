package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SetDeviceId {
  @JsonProperty("current_device_id")
  private String current_device_id = null;
  @JsonProperty("new_device_id")
  private String new_device_id = null;
  @JsonProperty("id")
  private Double id = null;
  public String getCurrent_device_id() {
    return current_device_id;
  }
  public void setCurrent_device_id(String current_device_id) {
    this.current_device_id = current_device_id;
  }

  public String getNew_device_id() {
    return new_device_id;
  }
  public void setNew_device_id(String new_device_id) {
    this.new_device_id = new_device_id;
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
    sb.append("class SetDeviceId {\n");
    sb.append("  current_device_id: ").append(current_device_id).append("\n");
    sb.append("  new_device_id: ").append(new_device_id).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

