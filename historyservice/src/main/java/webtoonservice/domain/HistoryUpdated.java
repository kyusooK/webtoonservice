package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class HistoryUpdated extends AbstractEvent {

    private Long id;
    private Integer point;
    private String userId;
    private String webtoonId;
    private String status;
    private Integer price;
    private Integer myPoint;

    public HistoryUpdated(History aggregate) {
        super(aggregate);
    }

    public HistoryUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
