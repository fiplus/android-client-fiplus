package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.InterestResponse;

import java.util.HashMap;
import java.util.Map;

public class InterestApi {
  String basePath = "/dev/extensions";
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

  public InterestResponse get_ (String input) throws ApiException {
    // create path and map variables
    String path = "/interest".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(input)))
      queryParams.put("input", String.valueOf(input));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (InterestResponse) ApiInvoker.deserialize(response, "", InterestResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  }

