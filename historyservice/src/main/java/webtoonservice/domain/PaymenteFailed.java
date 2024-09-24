package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class PaymenteFailed extends AbstractEvent {

    private Long id;
    private Integer price;
    private String userId;
    private String status;
}
