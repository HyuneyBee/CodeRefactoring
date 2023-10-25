package org.example.multiif;

public class AreaTwoFilter implements Filter{
    @Override
    public Area apply(Integer code) {
        if(code == Product.DRINK.getCode())
            return Area.TWO;
        return null;
    }
}
