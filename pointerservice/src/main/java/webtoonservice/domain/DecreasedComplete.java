package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DecreasedComplete extends AbstractEvent {

    private Long id;
    private Integer point;

    public DecreasedComplete(Pointer aggregate) {
        super(aggregate);
    }

    public DecreasedComplete() {
        super();
    }
}
//>>> DDD / Domain Event
