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

        FilterManage filterManage = new FilterManage();

        // filter 자체를 관리하는 클래스 생성하는 것도 좋은 방법
        Area area = filterManage.getArea(code);

        System.out.println(result);

    }
}
