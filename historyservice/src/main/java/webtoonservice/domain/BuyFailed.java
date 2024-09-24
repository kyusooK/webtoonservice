package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class BuyFailed extends AbstractEvent {

    private Long id;
    private String userId;
    private Integer point;
    private Integer myPoint;
    private String webtoonId;
    private String status;
}
