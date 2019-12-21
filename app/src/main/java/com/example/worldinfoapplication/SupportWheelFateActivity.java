package com.example.worldinfoapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.worldinfoapplication.enitity.EmployeeApiClient;
import com.example.worldinfoapplication.enitity.EmployeeApiInterface;
import com.example.worldinfoapplication.enitity.EmployeeInfo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Amir on 15-11-2019
 * implement the retrofit and fetch the employee
 * details
 */
public class SupportWheelFateActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_support_wheel_fate;
    }

    @Override
    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        showBackArrow();

        //fetch the employee info
        getEmployeeInfo();
    }



    @Override
    protected void networkConnected(boolean isConnected) {

    }

    @Override
    protected void getNetworkType(String networkType) {

    }


    private void getEmployeeInfo() {

        EmployeeApiInterface apiService =
                EmployeeApiClient.getClient().create( EmployeeApiInterface.class);

        Call<List<EmployeeInfo>> call= apiService.getEmployeeList();

        call.enqueue(new Callback<List<EmployeeInfo>>() {
            @Override
            public void onResponse(Call<List<EmployeeInfo>> call, Response<List<EmployeeInfo>> response) {

                List<EmployeeInfo> employeeInfoList=response.body();
                System.out.println("Employees "+employeeInfoList);
            }

            @Override
            public void onFailure(Call<List<EmployeeInfo>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }


}
