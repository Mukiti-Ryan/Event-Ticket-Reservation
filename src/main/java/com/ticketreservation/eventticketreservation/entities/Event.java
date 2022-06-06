package com.ticketreservation.eventticketreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private String title;
    private String description;
    private String specialFeatures;
    private String fullText;

    @ManyToOne
    private Ticket ticket1;
}
