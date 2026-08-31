package se331.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se331.lab.dao.EventDao;
import se331.lab.entity.Event;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EventServiceImpl implements EventService{
    final EventDao eventDao;

    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public List<Event> getEvents(Integer perPage, Integer page) {
        return eventDao.getEvents(perPage, page);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDao.getEvent(id);
    }
}
