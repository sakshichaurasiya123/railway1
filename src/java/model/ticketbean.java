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
public class ticketbean {
    private String source,destination;
    int journeydate;

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

    public int getJourneydate() {
        return journeydate;
    }

    public void setJourneydate(int journeydate) {
        this.journeydate = journeydate;
    }
    
}
