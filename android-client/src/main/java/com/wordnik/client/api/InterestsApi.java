package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import java.util.*;
import java.io.File;

public class InterestsApi {
  String basePath = "http://dev-fiplus.bitnamiapp.com:3001/api";
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
  public List<String> getInterestsWithInput (String input) throws ApiException {
    // create path and map variables
    String path = "/Interests".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(input)))
      queryParams.put("input", String.valueOf(input));
    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (List<String>) ApiInvoker.deserialize(response, "List", String.class);
    }
    else {
    	return null;
    }
  }
  }

