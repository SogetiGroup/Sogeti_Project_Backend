package com.sogeti.sogeti_project_backend.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor

public class InvitationsDto {

    private int invitationId;
    private String date;
    private String time;
    private String place;
    private String dressCode;
    private String cost;
    private String food;
    private String entertainment;

    public int getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(int invitationId) {
        this.invitationId = invitationId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDressCode() {
        return dressCode;
    }

    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }

    @Override
    public String toString() {
        return "InvitationsDto{" +
                "invitationId='" + invitationId + '\'' +
                ", Date=" + date +
                ", time=" + time +
                ", place='" + place + '\'' +
                ", dressCode='" + dressCode + '\'' +
                ", cost='" + cost + '\'' +
                ", food='" + food + '\'' +
                ", entertainment='" + entertainment + '\'' +
                '}';
    }
}