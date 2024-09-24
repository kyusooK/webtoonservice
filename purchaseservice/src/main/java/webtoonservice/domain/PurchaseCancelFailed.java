package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PurchaseCancelFailed extends AbstractEvent {

    private Long id;
    private Integer myPoint;
    private String userId;
    private String webtoonId;
    private String status;

    public PurchaseCancelFailed(Purchase aggregate) {
        super(aggregate);
    }

    public PurchaseCancelFailed() {
        super();
    }
}
//>>> DDD / Domain Event
