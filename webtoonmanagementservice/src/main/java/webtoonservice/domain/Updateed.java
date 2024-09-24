package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Updateed extends AbstractEvent {

    private Long id;
    private String webtoonId;
    private String title;
    private String author;
    private String point;
    private String episode;
    private String status;

    public Updateed(Webtoon aggregate) {
        super(aggregate);
    }

    public Updateed() {
        super();
    }
}
//>>> DDD / Domain Event
