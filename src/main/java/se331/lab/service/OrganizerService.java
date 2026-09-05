package se331.lab.service;

import org.springframework.data.domain.Page;
import se331.lab.entity.Organizer;

import java.util.List;

public interface OrganizerService {
    public Integer getOrganizerSize();
    public Page<Organizer> getOrganizers(Integer perPage, Integer page);
    public Organizer getOrganizer(Long id);
    public Organizer save(Organizer organizer);
}
