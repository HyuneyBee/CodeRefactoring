package org.example.multiif;

public class AreaOneFilter implements Filter{
    @Override
    public Area apply(Integer code) {
        if(code == Product.RICE.getCode()
            || code == Product.MEET.getCode())
            return Area.ONE;
        return null;
    }
}
