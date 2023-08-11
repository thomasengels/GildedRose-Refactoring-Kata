package com.gildedrose;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegularItem implements Updatable {
    @Override
    public int updateQuality(int currentQuality, int sellIn) {
        int newQuality;
        if(currentQuality <= 1){
            newQuality = 0;
            return newQuality;
        }
        if(sellIn < 0){
            newQuality = currentQuality - 2;
        }
        else {
            newQuality = --currentQuality;
        }

        return newQuality;
    }
}
