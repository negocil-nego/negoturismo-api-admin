package com.negocil.negoturismo.admin.feature.travel.repository;

import com.negocil.negoturismo.admin.feature.travel.enums.TravelType;
import com.negocil.negoturismo.admin.feature.travel.model.Travel;
import com.negocil.negoturismo.admin.feature.travel.util.TravelQuery;
import com.negocil.negoturismo.admin.shared.core.repository.ConcreteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface TravelRepository extends ConcreteRepository<Travel> {
    Optional<Travel> findByCityAndTypeAndDepartureTime(String city, TravelType type, LocalDateTime departureTime);

    @NativeQuery(value = TravelQuery.TRAVEL_SEARCH, countQuery = TravelQuery.TRAVEL_SEARCH_COUNT)
    Page<Travel> search(@Param("query") String query, Pageable pageable);
}
