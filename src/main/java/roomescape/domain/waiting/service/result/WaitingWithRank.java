package roomescape.domain.waiting.service.result;

import roomescape.domain.waiting.entity.ReserveWaiting;

public record WaitingWithRank(
        ReserveWaiting reserveWaiting,
        Integer rank
) {

    public WaitingWithRank(ReserveWaiting reserveWaiting, Long rank) {
        this(reserveWaiting, rank.intValue());
    }
}
