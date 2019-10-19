/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mohini
 */
public class reservebean {
    private String name,gender,travellingClass;
    private int age,BookingDate,PNR;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTravellingClass() {
        return travellingClass;
    }

    public void setTravellingClass(String travellingClass) {
        this.travellingClass = travellingClass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(int BookingDate) {
        this.BookingDate = BookingDate;
    }
    
    public int getPNR(){
    return PNR;
    }
    public void setPNR(int PNR){
    this.PNR=PNR;
    }
    
}
