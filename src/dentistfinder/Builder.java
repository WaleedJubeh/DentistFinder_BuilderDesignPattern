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
public interface Builder {
    /*
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
    private ArrayList<Specialization> specializations;
    */

    void setFirstName(String a);
    void setLasttName(String a);
    void setEmail(String a);
    void setWebsite(String a);
    void setPhoneNumber(String a);
    void setLCN(String a);
    void setlicenseNumber(String a);
    void setlearsinPractice(String a);
    void setGender(String a);
    void setAdressList(ArrayList<Address> a);
    void setEduList(ArrayList<Education> a);
    void setSpecializationsList(ArrayList<Specialization> a);
    Dentist getResult();

    
}
