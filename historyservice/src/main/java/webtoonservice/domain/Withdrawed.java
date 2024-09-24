package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class Withdrawed extends AbstractEvent {

    private Long id;
    private Integer point;
}
