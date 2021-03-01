package com.gp.study.designpattern.flyweightpattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFlyWeightFactory {
    private static Map<String, ITicket> ticketMap = new ConcurrentHashMap<>();

    public static ITicket getTicket(String from, String to) {
        String key = from + "_" + to;
        if (ticketMap.containsKey(key)) {
            return ticketMap.get(key);
        } else {
            ConcreteTicket ticket = new ConcreteTicket();
            ticket.setFrom(from);
            ticket.setTo(to);
            ticketMap.put(key, ticket);
            return ticket;
        }
    }
}
