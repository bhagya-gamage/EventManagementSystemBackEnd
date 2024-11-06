package edu.icet.service;

import edu.icet.dto.Event;
import edu.icet.dto.EventPlanner;

import java.util.List;

public interface EventServise {
    List<Event> getAll();
    void addEvent(Event event);
    void deleteEventById(Integer id);
    Event searchEventById(Integer id);
    void updateEventById(Event event);
}