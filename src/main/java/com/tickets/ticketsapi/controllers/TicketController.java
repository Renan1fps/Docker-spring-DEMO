package com.tickets.ticketsapi.controllers;

import com.tickets.ticketsapi.domain.Ticket;
import com.tickets.ticketsapi.usecases.SelectAnimeByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("tickets")
@AllArgsConstructor
public class TicketController {

    private final SelectAnimeByIdUseCase selectAnimeByIdUseCase;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Ticket> getTicketById(@PathVariable String id) {
        return new ResponseEntity<>(this.selectAnimeByIdUseCase.execute(id), HttpStatus.OK);
    }
}
