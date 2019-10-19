/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author Mohini
 */
public class trainbean {
    private String source,destination,trainname;
    private int trainno;

    private String dateofjourney;
    private String arrivaltime;
    private String departuretime;
   

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public int getTrainno() {
        return trainno;
    }

    public void setTrainno(int trainno) {
        this.trainno = trainno;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getDateofjourney() {
        return dateofjourney;
    }

    public void setDateofjourney(String dateofjourney) {
        this.dateofjourney = dateofjourney;
    }
    
    
    
}
