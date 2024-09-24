package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Withdrawed extends AbstractEvent {

    private Long id;
    private Integer point;

    public Withdrawed(Pointer aggregate) {
        super(aggregate);
    }

    public Withdrawed() {
        super();
    }
}
//>>> DDD / Domain Event
