package com.example.worldinfoapplication.enitity;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

public class CustomInterfaces {

    //create the interface

    //json object response
    public interface VolleyResponse {
      public   void onResponse(JSONObject object, String tag);
      public   void onError(VolleyError error, String tag);
    }

    //JSON array response
    public interface VolleyJsonArrayResponse{
        public   void onJsonArrayResponse(JSONArray object, String tag);
        public   void onJsonArrayError(VolleyError error, String tag);
    }

    public interface VolleyStringResponse{
        void onStringResponse(String object,String tag);
        void onStringError(VolleyError error,String tag);
    }

}
