package org.example;

import org.example.DatabaseApplication;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;
import org.example.service.TicketCrudService;

import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new DatabaseApplication().run();

        ClientCrudService clientCrudService = new ClientCrudService();
        Client ivanPetrovClient = clientCrudService.getById(1);

        List<Client> clients = clientCrudService.getAll();
        System.out.println(clients);

        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planetMars = planetCrudService.getById(1);
        Planet planetEarth = planetCrudService.getById(2);

        TicketCrudService ticketCrudService = new TicketCrudService();
        Ticket newTicket = new Ticket();
        newTicket.setCreatedAt(new Date());
        newTicket.setClient(ivanPetrovClient);
        newTicket.setFromPlanet(planetMars);
        newTicket.setToPlanet(planetEarth);
        ticketCrudService.create(newTicket);


    }
}