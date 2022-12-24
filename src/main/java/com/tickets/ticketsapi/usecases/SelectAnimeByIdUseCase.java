package com.tickets.ticketsapi.usecases;

import com.tickets.ticketsapi.domain.Ticket;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class SelectAnimeByIdUseCase {

    public static final List<Ticket> tickets = List.of(
            new Ticket("1", "tomorrowland", 1500.00, true),
            new Ticket("2", "UMF Miami", 2500.00, true)
    );

    public Ticket execute(String id) {
        return tickets.stream()
                .filter(ticket -> ticket.getId().equals(id))
                .findFirst().orElse(null);
    }
}
