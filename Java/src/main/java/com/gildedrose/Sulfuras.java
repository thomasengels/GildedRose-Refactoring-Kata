package com.gildedrose;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Sulfuras implements Updatable {

    private static final int SULFURAS_QUALITY = 80;

    @Override
    public int updateQuality(int currentQuality, int sellIn) {
        return SULFURAS_QUALITY;
    }
}
