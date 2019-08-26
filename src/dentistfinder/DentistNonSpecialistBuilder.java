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
public class DentistNonSpecialistBuilder implements Builder{
    private String  first_name;
    private String  last_name;
    private String  email;
    private String  website;
    private String  phoneNumber;
    private String  LCN;
    private String  licenseNumber;
    private String  learsinPractice;
    private String  gender;
    private ArrayList<Education> eduList;
    private ArrayList<Address> addList;
    @Override
    public void setFirstName(String a) {
        first_name=a;
    }

    @Override
    public void setLasttName(String a) {
        last_name=a;
    }

    @Override
    public void setEmail(String a) {
        email=a;
    }

    @Override
    public void setWebsite(String a) {
        website=a;
    }

    @Override
    public void setPhoneNumber(String a) {
        phoneNumber=a;
    }

    @Override
    public void setLCN(String a) {
        LCN=a;
    }

    @Override
    public void setlicenseNumber(String a) {
        licenseNumber=a;
    }

    @Override
    public void setlearsinPractice(String a) {
        learsinPractice=a;
    }

    @Override
    public void setGender(String a) {
            gender=a;
        }

    @Override
    public void setAdressList(ArrayList<Address> a) {
            addList=a;
    }

    @Override
    public void setEduList(ArrayList<Education> a) {
            eduList=a;
     }

    @Override
    public void setSpecializationsList(ArrayList<Specialization> a) {
    }
    public Dentist getResult()
    {
        return new Dentist(first_name, last_name, email, website, phoneNumber, LCN, licenseNumber, learsinPractice, gender, eduList, addList, false, null);
    }
}
