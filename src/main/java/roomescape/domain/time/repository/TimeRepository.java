package roomescape.domain.time.repository;

import org.springframework.data.repository.ListCrudRepository;
import roomescape.domain.time.entity.Time;

import java.time.LocalTime;
import java.util.Optional;

public interface TimeRepository extends ListCrudRepository<Time,Long> {
}
