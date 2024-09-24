package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class BuyFailed extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer point;
    private Integer myPoint;
    private String webtoonId;
    private String status;

    public BuyFailed(Purchase aggregate) {
        super(aggregate);
    }

    public BuyFailed() {
        super();
    }
}
//>>> DDD / Domain Event
