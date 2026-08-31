package se331.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se331.lab.dao.OrganizerDao;
import se331.lab.entity.Organizer;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    final OrganizerDao organizerDao;

    @Override
    public Integer getOrganizerSize() {
        return organizerDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer perPage, Integer page) {
        return organizerDao.getOrganizers(perPage, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerDao.getOrganizer(id);
    }
}
