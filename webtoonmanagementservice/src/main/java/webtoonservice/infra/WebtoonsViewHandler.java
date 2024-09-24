package webtoonservice.infra;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import webtoonservice.config.kafka.KafkaProcessor;
import webtoonservice.domain.*;

@Service
public class WebtoonsViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private WebtoonsRepository webtoonsRepository;
    //>>> DDD / CQRS
}
