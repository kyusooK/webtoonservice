package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class PaymenteComplete extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;
}
