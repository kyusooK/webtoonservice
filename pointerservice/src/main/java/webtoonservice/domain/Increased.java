package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Increased extends AbstractEvent {

    private Long id;
    private Integer point;

    public Increased(Pointer aggregate) {
        super(aggregate);
    }

    public Increased() {
        super();
    }
}
//>>> DDD / Domain Event
