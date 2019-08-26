/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistfinder;

import java.util.ArrayList;

/**
 *
 * @author Android
 */
public class Dentist {
    private String  first_name;
    private String  last_name;
    private String  email;
    private String  website;
    private String  phoneNumber;
    private String  LCN;
    private String  licenseNumber;
    private String  learsinPractice;
    private String  Gender;
    private ArrayList<Education> eduList;
    private ArrayList<Address> AddList;
    private boolean isSpecialist;
    private ArrayList<Specialization> specializationsList;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLCN() {
        return LCN;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getLearsinPractice() {
        return learsinPractice;
    }

    public String getGender() {
        return Gender;
    }

    public ArrayList<Education> getEduList() {
        return eduList;
    }

    public ArrayList<Address> getAddList() {
        return AddList;
    }

    public boolean getIsSpecialist() {
        return isSpecialist;
    }

    public ArrayList<Specialization> getSpecializationsList() {
        return specializationsList;
    }

    public Dentist(String first_name, String last_name, String email, String website, String phoneNumber, String LCN, String licenseNumber, String learsinPractice, String Gender, ArrayList<Education> eduList, ArrayList<Address> AddList, boolean isSpecialist, ArrayList<Specialization> specializationsList) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.LCN = LCN;
        this.licenseNumber = licenseNumber;
        this.learsinPractice = learsinPractice;
        this.Gender = Gender;
        this.eduList = eduList;
        this.AddList = AddList;
        this.isSpecialist = isSpecialist;
        this.specializationsList = specializationsList;
    }

    
}
