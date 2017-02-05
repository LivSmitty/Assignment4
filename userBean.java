/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livsmitty.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author scott_000
 */


@Named(value = "userBean")
@SessionScoped


public class userBean implements Serializable {

    
    String ticketQuantity;
    String goodbye;
    int numOfTickets = 0;
    boolean bulkTickets = false;

    public boolean isBulkTickets() {
        return bulkTickets;
    }

    public void setBulkTickets(boolean bulkTickets) {
        this.bulkTickets = bulkTickets;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }
    
    
    public userBean() {
        
    }

    public String getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(String ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public String getGoodbye() {
        return goodbye;
    }

    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }
    
    public String ticketQuantity(){
        return "ticketQuantity";
    }  
    
    public String goodbye(){
        return "goodbye";
    }
    
    
}
