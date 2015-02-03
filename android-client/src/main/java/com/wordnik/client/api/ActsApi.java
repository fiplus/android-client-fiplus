package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Location;
import com.wordnik.client.model.Time;
import com.wordnik.client.model.Activity;
import com.wordnik.client.model.Attendee;
import java.util.*;
import java.io.File;

public class ActsApi {
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

  //error info- code: 204 reason: "Request was successful" model: <none>
  public void createActivity (Activity body) throws ApiException {
    // create path and map variables
    String path = "/Acts".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 200 reason: "Request was successful" model: <none>
  public Activity getActivity (String id) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (Activity) ApiInvoker.deserialize(response, "", Activity.class);
    }
    else {
    	return null;
    }
  }
  //error info- code: 200 reason: "Request was successful" model: <none>
  public Attendee getAttendees (String id, Double Limit) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}/user".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(Limit)))
      queryParams.put("Limit", String.valueOf(Limit));
    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (Attendee) ApiInvoker.deserialize(response, "", Attendee.class);
    }
    else {
    	return null;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void joinActivity (String id) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}/user".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, null, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void suggestTimeForActivity (String id, Time body) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}/time".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void suggestLocationForActivity (String id, Location body) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}/location".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void voteForSuggestion (String id) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/suggestion/{id}/user".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, null, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void tagActivityWithInterest (String id, String text) throws ApiException {
    // verify required params are set
    if(id == null || text == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Acts/{id}/interest/{text}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "text" + "\\}", apiInvoker.escapeString(text.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, null, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  }

