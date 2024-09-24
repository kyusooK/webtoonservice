package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CancelFailed extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;
    private Integer myPoint;

    public CancelFailed(Purchase aggregate) {
        super(aggregate);
    }

    public CancelFailed() {
        super();
    }
}
//>>> DDD / Domain Event
