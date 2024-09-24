package webtoonservice.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import webtoonservice.domain.*;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentsRepository
    extends PagingAndSortingRepository<Payments, Long> {}
