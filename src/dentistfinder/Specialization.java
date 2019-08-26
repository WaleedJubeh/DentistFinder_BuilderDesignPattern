/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistfinder;

/**
 *
 * @author Android
 */
public class Specialization {
    private String areaOfSpecialization;
    private String year;

    public Specialization(String areaOfSpecialization, String year)
    {
        this.areaOfSpecialization = areaOfSpecialization;
        this.year = year;
    }

    public String getAreaOfSpecialization() {
        return areaOfSpecialization;
    }

    public String getYear() {
        return year;
    }
    
}
