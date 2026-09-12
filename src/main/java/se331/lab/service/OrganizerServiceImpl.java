package se331.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab.dao.OrganizerDao;
import se331.lab.entity.Organizer;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrganizerServiceImpl implements OrganizerService {
    final OrganizerDao organizerDao;

    @Override
    public List<Organizer> getAllOrganizer() {
        return organizerDao.getOrganizers(Pageable.unpaged()).getContent();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer perPage, Integer page) {
        return organizerDao.getOrganizers(PageRequest.of(page, perPage));
    }
}
