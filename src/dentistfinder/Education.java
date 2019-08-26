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
public class Education {
    private String Degree;
        private String Major;
        private String School;
        private String Year;

    public String getDegree() {
        return Degree;
    }

    public String getMajor() {
        return Major;
    }

    public String getSchool() {
        return School;
    }

    public String getYear() {
        return Year;
    }

    public Education(String Degree, String Major, String School, String Year) {
        this.Degree = Degree;
        this.Major = Major;
        this.School = School;
        this.Year = Year;
    }
        
    
}
