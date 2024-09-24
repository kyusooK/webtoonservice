package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Uploaded extends AbstractEvent {

    private Long id;
    private String webtoonId;
    private String title;
    private String author;
    private String point;
    private String episode;
    private String status;

    public Uploaded(Webtoon aggregate) {
        super(aggregate);
    }

    public Uploaded() {
        super();
    }
}
//>>> DDD / Domain Event
