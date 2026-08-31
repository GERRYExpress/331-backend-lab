package se331.lab.dao;

import se331.lab.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    public Integer getOrganizerSize();
    public List<Organizer> getOrganizers(Integer perPage, Integer page);
    public Organizer getOrganizer(Long id);
}
