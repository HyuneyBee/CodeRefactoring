package org.example.multiif;

public class AreaDefaultFilter implements Filter{
    @Override
    public Area apply(Integer code) {
        return Area.THREE;
    }
}
