package webtoonservice.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import webtoonservice.domain.*;

@Component
public class HistoryHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<History>> {

    @Override
    public EntityModel<History> process(EntityModel<History> model) {
        return model;
    }
}
