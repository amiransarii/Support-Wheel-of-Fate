package com.example.worldinfoapplication.enitity;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Amir on 15-11-2019
 */
public interface EmployeeApiInterface {
    @GET("/v2/5dcd18d32e00006e00729aa9") // specify the sub url for our base url
    Call<List<EmployeeInfo>> getEmployeeList();
}
