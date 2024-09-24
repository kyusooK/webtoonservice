package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Joind extends AbstractEvent {

    private Long id;
    private Integer point;

    public Joind(Pointer aggregate) {
        super(aggregate);
    }

    public Joind() {
        super();
    }
}
//>>> DDD / Domain Event
