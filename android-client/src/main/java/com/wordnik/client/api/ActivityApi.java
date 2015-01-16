package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Undocumented;
import com.wordnik.client.model.Location;
import com.wordnik.client.model.Comment;
import com.wordnik.client.model.Time;
import com.wordnik.client.model.Icebreaker;
import com.wordnik.client.model.Activity;
import com.wordnik.client.model.ActivityDetailResponse;
import com.wordnik.client.model.Report;
import com.wordnik.client.model.Answer;
import java.util.*;
import java.io.File;

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
  public ActivityDetailResponse GetEvent (String activityid) throws ApiException {
    // verify required params are set
    if(activityid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityid" + "\\}", apiInvoker.escapeString(activityid.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (ActivityDetailResponse) ApiInvoker.deserialize(response, "", ActivityDetailResponse.class);
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
  public String GetAttendees (String activityid, Integer Limit) throws ApiException {
    // verify required params are set
    if(activityid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityid}/user".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityid" + "\\}", apiInvoker.escapeString(activityid.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(Limit)))
      queryParams.put("Limit", String.valueOf(Limit));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
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
  public String suggestTimePeriodForActivity (Time body, String activityId) throws ApiException {
    // verify required params are set
    if(activityId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityId}/time".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityId" + "\\}", apiInvoker.escapeString(activityId.toString()));

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
  public String suggestLocationForActivity (Location body, String activityId) throws ApiException {
    // verify required params are set
    if(activityId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityId}/location".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityId" + "\\}", apiInvoker.escapeString(activityId.toString()));

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
  public String voteForSuggestion (Undocumented body, String suggestionId, String userId) throws ApiException {
    // verify required params are set
    if(suggestionId == null || userId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/suggestion/{suggestionId}/user/{userId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "suggestionId" + "\\}", apiInvoker.escapeString(suggestionId.toString())).replaceAll("\\{" + "userId" + "\\}", apiInvoker.escapeString(userId.toString()));

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
  public String joinActivity (Undocumented body, String activityid, String userid) throws ApiException {
    // verify required params are set
    if(activityid == null || userid == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/activity/{activityid}/user/{userid}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "activityid" + "\\}", apiInvoker.escapeString(activityid.toString())).replaceAll("\\{" + "userid" + "\\}", apiInvoker.escapeString(userid.toString()));

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

