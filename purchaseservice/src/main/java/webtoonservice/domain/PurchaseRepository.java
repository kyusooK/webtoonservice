package webtoonservice.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import webtoonservice.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "purchases", path = "purchases")
public interface PurchaseRepository
    extends PagingAndSortingRepository<Purchase, Long> {}
