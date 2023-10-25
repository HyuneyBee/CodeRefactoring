package org.example.multiif;

public class OldApp {
    public static void main(String[] args) {
        int code = 1;
        Area area;

        if(code == Product.RICE.getCode()
            || code == Product.MEET.getCode()){
            area = Area.ONE;
        } else if (code == Product.DRINK.getCode()) {
            area = Area.TWO;
        } else {
            area = Area.THREE;
        }

        System.out.println(area);
    }
}
