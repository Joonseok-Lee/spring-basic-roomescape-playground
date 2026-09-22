package roomescape.domain.time.repository;

import org.springframework.data.repository.ListCrudRepository;
import roomescape.domain.time.entity.Time;

public interface TimeRepository extends ListCrudRepository<Time,Long> {
}
