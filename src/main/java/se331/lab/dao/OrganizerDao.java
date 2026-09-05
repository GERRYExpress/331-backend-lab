package se331.lab.dao;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;
import se331.lab.entity.Organizer;

import java.util.List;

public interface OrganizerDao {
    Integer getOrganizerSize();
    Page<Organizer> getOrganizers(Integer perPage, Integer page);
    Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
}
