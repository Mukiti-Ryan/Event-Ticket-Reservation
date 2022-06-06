package com.ticketreservation.eventticketreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.LAZY;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class County {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long countyId;
    private String nameOfCounty;
    private Timestamp lastUpdate;

    @OneToMany(fetch = LAZY)
    private Collection<City> cities = new ArrayList<>();
}
