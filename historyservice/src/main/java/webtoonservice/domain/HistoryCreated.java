package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class HistoryCreated extends AbstractEvent {

    private Long id;
    private Integer myPoint;
    private String userId;
    private Integer price;
    private String status;

    public HistoryCreated(History aggregate) {
        super(aggregate);
    }

    public HistoryCreated() {
        super();
    }
}
//>>> DDD / Domain Event
