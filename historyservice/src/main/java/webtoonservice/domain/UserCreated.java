package webtoonservice.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserCreated extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer myPoint;
    private String status;
    private Date createDate;

    public UserCreated(History aggregate) {
        super(aggregate);
    }

    public UserCreated() {
        super();
    }
}
//>>> DDD / Domain Event
