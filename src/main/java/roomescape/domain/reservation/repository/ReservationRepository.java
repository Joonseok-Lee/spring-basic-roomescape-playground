package roomescape.domain.reservation.repository;

import org.springframework.data.repository.ListCrudRepository;
import roomescape.domain.reservation.entity.Reservation;
import roomescape.domain.theme.entity.Theme;
import roomescape.domain.time.entity.Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface ReservationRepository extends ListCrudRepository<Reservation, Long> {

    List<Reservation> findByDateAndThemeId(LocalDate date, Long themeId);

    boolean existsByTheme(Theme theme);

    boolean existsByDateAndTimeAndTheme(LocalDate date, Time time, Theme theme);
}
