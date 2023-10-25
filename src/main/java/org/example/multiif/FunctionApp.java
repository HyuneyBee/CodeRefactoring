package org.example.multiif;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FunctionApp {
    public static void main(String[] args) {
        int code = 5;

        List<Filter> filterList = Arrays.asList(
            new AreaOneFilter(), new AreaTwoFilter(), new AreaDefaultFilter());

        Area result = filterList.stream()
            .map(filter -> filter.apply(code))
            .filter(Objects::nonNull)
            .findFirst()
            .orElse(null);

        System.out.println(result);

    }
}
