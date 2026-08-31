package se331.lab.service;

import se331.lab.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    public Integer getOrganizerSize();
    public List<Organizer> getOrganizers(Integer perPage, Integer page);
    public Organizer getOrganizer(Long id);
}
