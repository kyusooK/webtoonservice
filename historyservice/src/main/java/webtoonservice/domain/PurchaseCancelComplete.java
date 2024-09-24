package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class PurchaseCancelComplete extends AbstractEvent {

    private Long id;
    private Integer myPoint;
    private String userId;
    private String webtoonId;
    private String status;
}
