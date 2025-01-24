package com.healthcaremanagement.model;

import java.util.Objects;

public class Hospital {
    private int hospitalId;
    private String hospitalName;
    private String address;
    private String contactNo;
    private String emailId;

    public Hospital(int hospitalId, String hospitalName, String address, String contactNo, String emailId) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.address = address;
        this.contactNo = contactNo;
        this.emailId = emailId;
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalId=" + hospitalId +
                ", hospitalName='" + hospitalName + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return getHospitalId() == hospital.getHospitalId() && Objects.equals(getHospitalName(), hospital.getHospitalName()) && Objects.equals(getAddress(), hospital.getAddress()) && Objects.equals(getContactNo(), hospital.getContactNo()) && Objects.equals(getEmailId(), hospital.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHospitalId(), getHospitalName(), getAddress(), getContactNo(), getEmailId());
    }
}
