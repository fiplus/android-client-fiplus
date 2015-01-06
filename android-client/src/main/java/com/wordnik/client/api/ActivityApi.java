package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Activity;
import com.wordnik.client.model.Answer;
import com.wordnik.client.model.Comment;
import com.wordnik.client.model.Icebreaker;
import com.wordnik.client.model.Location;
import com.wordnik.client.model.Report;
import com.wordnik.client.model.Time;
import com.wordnik.client.model.Undocumented;

import java.util.HashMap;
import java.util.Map;

public class ActivityApi {
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

  public String createActivity (Activity body) throws ApiException {
    // create path and map variables
    String path = "/activity".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String post_icebreaker_answer (Answer body) throws ApiException {
    // create path and map variables
    String path = "/activity/icebreaker/answer".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_icebreaker (Icebreaker body) throws ApiException {
    // create path and map variables
    String path = "/activity/icebreaker".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_activity_id_user_user_id (Undocumented body, String activity_id, String user_id) throws ApiException {
    // verify required params are set
    if(activity_id == null || user_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activity_id}/user/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activity_id" + "\\}", apiInvoker.escapeString(activity_id.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String delete_activity_id_user_user_id (String activity_id, String user_id) throws ApiException {
    // verify required params are set
    if(activity_id == null || user_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activity_id}/user/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activity_id" + "\\}", apiInvoker.escapeString(activity_id.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_activity_id_time (Time body, String activity_id) throws ApiException {
    // verify required params are set
    if(activity_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activity_id}/time".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activity_id" + "\\}", apiInvoker.escapeString(activity_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String post_activity_id_time_time_id_user_user_id (Undocumented body, String activity_id, String time_id, String user_id) throws ApiException {
    // verify required params are set
    if(activity_id == null || time_id == null || user_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activity_id}/time/{time_id}/user/{user_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activity_id" + "\\}", apiInvoker.escapeString(activity_id.toString())).replaceAll("\\{" + "time_id" + "\\}", apiInvoker.escapeString(time_id.toString())).replaceAll("\\{" + "user_id" + "\\}", apiInvoker.escapeString(user_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_location (Location body) throws ApiException {
    // create path and map variables
    String path = "/activity/location".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String post_activity_id_location_location_id (Undocumented body, String activity_id, String location_id) throws ApiException {
    // verify required params are set
    if(activity_id == null || location_id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activity_id}/location/{location_id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activity_id" + "\\}", apiInvoker.escapeString(activity_id.toString())).replaceAll("\\{" + "location_id" + "\\}", apiInvoker.escapeString(location_id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_comment (Comment body) throws ApiException {
    // create path and map variables
    String path = "/activity/comment".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String put_report (Report body) throws ApiException {
    // create path and map variables
    String path = "/activity/report".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  public String tagActivityWithInterest (Undocumented body, String activityid, String interest) throws ApiException {
    // verify required params are set
    if(activityid == null || interest == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityid}/interest/{interest}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityid" + "\\}", apiInvoker.escapeString(activityid.toString())).replaceAll("\\{" + "interest" + "\\}", apiInvoker.escapeString(interest.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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

