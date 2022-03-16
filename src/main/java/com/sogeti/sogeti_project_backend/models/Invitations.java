package com.sogeti.sogeti_project_backend.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invitations {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invitationsId;
    private String Date;
    private String time;
    private String place;
    private String dressCode;
    private String cost;
    private String food;
    private String entertainment;


    public int getInvitationId() {
        return invitationsId;
    }

    public void setInvitationId(int invitationId) {
        this.invitationsId = invitationId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invitations that = (Invitations) o;
        return Objects.equals(Date, that.Date) && Objects.equals(time, that.time) && Objects.equals(place, that.place) && Objects.equals(dressCode, that.dressCode) && Objects.equals(cost, that.cost) && Objects.equals(food, that.food) && Objects.equals(entertainment, that.entertainment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Date, time, place, dressCode, cost, food, entertainment);
    }

    @Override
    public String toString() {
        return "Invitations{" +
                "invitationsId='" + invitationsId + '\'' +
                ", Date=" + Date +
                ", time=" + time +
                ", place='" + place + '\'' +
                ", dressCode='" + dressCode + '\'' +
                ", cost='" + cost + '\'' +
                ", food='" + food + '\'' +
                ", entertainment='" + entertainment + '\'' +
                '}';
    }



}
