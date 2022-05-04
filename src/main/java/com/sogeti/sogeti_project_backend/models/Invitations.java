package com.sogeti.sogeti_project_backend.models;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@RequiredArgsConstructor
@Entity
public class Invitations {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invitationsId;
    private String Date;
    private String time;
    private String place;
    private String dressCode;
    private String cost;
    private String food;
    private String entertainment;


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
}
