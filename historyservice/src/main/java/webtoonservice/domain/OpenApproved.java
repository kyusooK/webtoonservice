package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OpenApproved extends AbstractEvent {

    private Long id;
    private String userId;
    private String webtoonId;
    private String status;

    public OpenApproved(History aggregate) {
        super(aggregate);
    }

    public OpenApproved() {
        super();
    }
}
//>>> DDD / Domain Event
