package webtoonservice.domain;

import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import webtoonservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "webtoons", path = "webtoons")
public interface WebtoonRepository
    extends PagingAndSortingRepository<Webtoon, Long> {}
