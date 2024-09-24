package webtoonservice.domain;

import java.util.*;
import lombok.*;
import webtoonservice.domain.*;
import webtoonservice.infra.AbstractEvent;

@Data
@ToString
public class OpenChecked extends AbstractEvent {

    private Long id;
    private String userId;
    private String webtoonId;
    private String status;
}
