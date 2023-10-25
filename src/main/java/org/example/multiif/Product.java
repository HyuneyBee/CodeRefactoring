package org.example.multiif;

public enum Product {
    RICE(0),
    MEET(1),
    DRINK(2);

    private final int code;

    Product(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
