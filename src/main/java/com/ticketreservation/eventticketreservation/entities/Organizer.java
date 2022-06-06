package com.ticketreservation.eventticketreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long organizerId;
    private String companyName;
    private String email;
    private String companyContact;
    private String personFname;
    private String personLname;
    private Timestamp lastUpdate;
}
