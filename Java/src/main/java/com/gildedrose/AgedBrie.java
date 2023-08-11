package com.gildedrose;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AgedBrie implements Updatable {

    @Override
    public int updateQuality(int currentQuality, int sellIn) {
        return ++currentQuality;
    }
}
