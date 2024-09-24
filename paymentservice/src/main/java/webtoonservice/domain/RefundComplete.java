package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class RefundComplete extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;

    public RefundComplete(Payment aggregate) {
        super(aggregate);
    }

    public RefundComplete() {
        super();
    }
}
//>>> DDD / Domain Event
