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
public class Address {
    private String Country;
    private String State;
    private String City;
    private String PostalCode;

    public Address(String Country, String State, String City, String PostalCode) {
        this.Country = Country;
        this.State = State;
        this.City = City;
        this.PostalCode = PostalCode;
    }

    public String getCountry() {
        return Country;
    }

    public String getState() {
        return State;
    }

    public String getCity() {
        return City;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    @Override
    public String toString() {
        return "Address "  + Country + ", " + State + ", " + City + ", " + PostalCode + '}';
    }
    
    
}
