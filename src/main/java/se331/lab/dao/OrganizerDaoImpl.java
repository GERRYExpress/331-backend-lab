package se331.lab.dao;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import se331.lab.entity.Organizer;

import java.util.ArrayList;
import java.util.List;

@Profile("memory")
@Repository
public class OrganizerDaoImpl implements OrganizerDao {
    List<Organizer> organizerList;

    @PostConstruct
    public void init() {
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
                .id(1L)
                .name("Kat Laydee")
                .address("Meow Town")
                .build());
        organizerList.add(Organizer.builder()
                .id(2L)
                .name("Fern Pollin")
                .address("Flora City")
                .build());
        organizerList.add(Organizer.builder()
                .id(3L)
                .name("Carey Wales")
                .address("Playa Del Carmen")
                .build());
        organizerList.add(Organizer.builder()
                .id(4L)
                .name("Dawg Dahd")
                .address("Woof Town")
                .build());
        organizerList.add(Organizer.builder()
                .id(5L)
                .name("Kahn Opiner")
                .address("Tin City")
                .build());
        organizerList.add(Organizer.builder()
                .id(6L)
                .name("Brody Kill")
                .address("Highway 50")
                .build());
    }

    @Override
    public Integer getOrganizerSize() {
        return organizerList.size();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (pageSize - 1) * page;
        return new PageImpl<>(organizerList.subList(firstIndex, firstIndex + pageSize), PageRequest.of(page - 1, pageSize), organizerList.size());
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerList.stream().filter(organizer -> organizer.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Organizer save(Organizer organizer) {
        organizerList.add(organizer);
        return organizer;
    }
}
