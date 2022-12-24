package com.tickets.ticketsapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ticket {
    private String id;
    private String name;
    private Double value;
    private Boolean isAvailable;
}
