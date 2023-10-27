package org.example.multiif;

import java.util.List;
import java.util.Objects;

public class FilterManage {
    private final List<Filter> filters = List.of(new AreaOneFilter(), new AreaTwoFilter(), new AreaDefaultFilter());

    public Area getArea(Integer code) {
        return filters.stream()
            .map(filter -> filter.apply(code))
            .filter(Objects::nonNull)
            .findFirst()
            .orElse(null);
    }
}
