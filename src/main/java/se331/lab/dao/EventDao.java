package se331.lab.dao;

import se331.lab.entity.Event;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer perPage, Integer page);
    Event getEvent(Long id);
}
