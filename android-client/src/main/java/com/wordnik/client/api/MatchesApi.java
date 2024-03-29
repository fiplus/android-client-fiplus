package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Activity;
import java.util.*;
import java.io.File;

public class MatchesApi {
  String basePath = "http://localhost:3001/api";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  //error info- code: 200 reason: "Request was successful" model: <none>
  public List<Activity> matchActivities (Double num_activities, Boolean by_interest, Boolean by_location, Double priority_offset) throws ApiException {
    // create path and map variables
    String path = "/Matches/activities".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(num_activities)))
      queryParams.put("num_activities", String.valueOf(num_activities));
    if(!"null".equals(String.valueOf(by_interest)))
      queryParams.put("by_interest", String.valueOf(by_interest));
    if(!"null".equals(String.valueOf(by_location)))
      queryParams.put("by_location", String.valueOf(by_location));
    if(!"null".equals(String.valueOf(priority_offset)))
      queryParams.put("priority_offset", String.valueOf(priority_offset));
    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (List<Activity>) ApiInvoker.deserialize(response, "List", Activity.class);
    }
    else {
    	return null;
    }
  }
  }

