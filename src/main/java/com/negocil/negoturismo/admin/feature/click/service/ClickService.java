package com.negocil.negoturismo.admin.feature.click.service;

import com.negocil.negoturismo.admin.feature.click.dto.response.ClickTodayResponse;
import com.negocil.negoturismo.admin.feature.click.enums.ClickType;
import com.negocil.negoturismo.admin.feature.click.repository.ClickRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ClickService {

    private final ClickRepository repository;

    public ClickTodayResponse getClicksToday() {
        Instant startOfDay = LocalDate.now(ZoneOffset.UTC)
                .atStartOfDay(ZoneOffset.UTC)
                .toInstant();

        List<Object[]> results = repository.countByTypeToday(startOfDay);

        Map<String, Long> clicksByType = new LinkedHashMap<>();
        for (ClickType type : ClickType.values()) {
            clicksByType.put(type.name(), 0L);
        }

        for (Object[] row : results) {
            ClickType type = (ClickType) row[0];
            Long count = (Long) row[1];
            clicksByType.put(type.name(), count);
        }

        return new ClickTodayResponse(clicksByType);
    }
}
