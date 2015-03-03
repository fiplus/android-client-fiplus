package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Credentials;
import com.wordnik.client.model.WhoAmI;
import com.wordnik.client.model.Favourites;
import com.wordnik.client.model.SetDeviceId;
import com.wordnik.client.model.UserProfile;
import com.wordnik.client.model.Activity;
import java.util.*;
import java.io.File;

public class UsersApi {
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

  //error info- code: 204 reason: "Request was successful" model: <none>
  public void registerUser (Credentials body) throws ApiException {
    // create path and map variables
    String path = "/Users/register".replaceAll("\\{format\\}","json");

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
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void login (Credentials body) throws ApiException {
    // create path and map variables
    String path = "/Users/login".replaceAll("\\{format\\}","json");

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
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void logout () throws ApiException {
    // create path and map variables
    String path = "/Users/logout".replaceAll("\\{format\\}","json");

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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public WhoAmI whoAmI () throws ApiException {
    // create path and map variables
    String path = "/Users/whoami".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (WhoAmI) ApiInvoker.deserialize(response, "", WhoAmI.class);
    }
    else {
    	return null;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void echo () throws ApiException {
    // create path and map variables
    String path = "/Users/echo".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void saveUserProfile (UserProfile body) throws ApiException {
    // create path and map variables
    String path = "/Users/profile".replaceAll("\\{format\\}","json");

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
  //error info- code: 200 reason: "Request was successful" model: <none>
  public UserProfile getUserProfile (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Users/profile/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (UserProfile) ApiInvoker.deserialize(response, "", UserProfile.class);
    }
    else {
    	return null;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void addFavourite (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Users/favourites/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

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
  public void deleteFavourites (String userId) throws ApiException {
    // verify required params are set
    if(userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/Users/favourites/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, contentType);
    if(response != null){
    	return ;
    }
    else {
    	return ;
    }
  }
  //error info- code: 200 reason: "Request was successful" model: <none>
  public Favourites getFavourites (Double Limit) throws ApiException {
    // create path and map variables
    String path = "/Users/favourites".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(Limit)))
      queryParams.put("Limit", String.valueOf(Limit));
    String contentType = "application/json";

    String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
    if(response != null){
    	return (Favourites) ApiInvoker.deserialize(response, "", Favourites.class);
    }
    else {
    	return null;
    }
  }
  //error info- code: 204 reason: "Request was successful" model: <none>
  public void setDeviceId (SetDeviceId body) throws ApiException {
    // create path and map variables
    String path = "/Users/device".replaceAll("\\{format\\}","json");

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
  public List<Activity> getActivities (String userId, Boolean past, Boolean future) throws ApiException {
    // create path and map variables
    String path = "/Users/activities".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(userId)))
      queryParams.put("userId", String.valueOf(userId));
    if(!"null".equals(String.valueOf(past)))
      queryParams.put("past", String.valueOf(past));
    if(!"null".equals(String.valueOf(future)))
      queryParams.put("future", String.valueOf(future));
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

