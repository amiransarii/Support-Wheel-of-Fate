package com.example.worldinfoapplication.enitity;

import com.google.gson.annotations.SerializedName;

public class EmployeeInfo {
    @SerializedName("id")
    private String empID;



    @SerializedName("name")
    private String empName;


    public EmployeeInfo(){

    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public EmployeeInfo(String empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
}
