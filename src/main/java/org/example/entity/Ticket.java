package org.example.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "TICKET")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private  int id;

    @Column(name = "CREATED_AT")
    private Date createdAt;


    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", nullable = false)
    private Client client;


    @ManyToOne
    @JoinColumn(name = "FROM_PLANET_ID", nullable = false)
    private Planet fromPlanet;

    @ManyToOne
    @JoinColumn(name = "TO_PLANET_ID", nullable = false)
    private Planet toPlanet;

}
