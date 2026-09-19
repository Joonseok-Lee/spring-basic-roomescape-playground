package roomescape.domain.reservation.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import roomescape.domain.reservation.entity.Reservation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public record MyReservationsResponse(
        Long reservationId,
        String theme,

        @JsonFormat(pattern = "yyyy-MM-dd")
        LocalDate date,

        @JsonFormat(pattern = "HH:mm")
        LocalTime time,
        String status
) {
    public static List<MyReservationsResponse> from(List<Reservation> reservations) {
        return reservations.stream()
                .map(reservation -> new MyReservationsResponse(
                        reservation.getId(),
                        reservation.getTheme().getName(),
                        reservation.getDate(),
                        reservation.getTime().getTimeValue(),
                        "예약"
                )).toList();
    }
}
