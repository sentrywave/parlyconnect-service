package com.sentrywave.parlyconnect.common;

import lombok.Getter;

@Getter
public enum Province {
    BULAWAYO("Bulawayo"),
    HARARE("Harare"),
    MANICALAND("Manicaland"),
    MASH_CENTRAL("Mashonaland Central"),
    MASH_EAST("Mashonaland East"),
    MASH_WEST("Mashonaland West"),
    MASVINGO("Masvingo"),
    MAT_NORTH("Matebeland North"),
    MAT_SOUTH("Matebeland South"),
    MIDLANDS("Midlands");

    private String name;

    Province(String name) {
        this.name = name;
    }
}
