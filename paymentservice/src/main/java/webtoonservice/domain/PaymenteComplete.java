package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymenteComplete extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;

    public PaymenteComplete(Payment aggregate) {
        super(aggregate);
    }

    public PaymenteComplete() {
        super();
    }
}
//>>> DDD / Domain Event
