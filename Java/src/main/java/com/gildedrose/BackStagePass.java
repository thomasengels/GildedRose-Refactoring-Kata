package com.gildedrose;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BackStagePass implements Updatable {
    @Override
    public int updateQuality(int currentQuality, int sellIn) {
        int newQuality;
        if(sellIn > 10){
            newQuality = ++currentQuality;
        }
        else if(sellIn > 5){
            newQuality = currentQuality * 2;
        }
        else if(sellIn >= 0){
            newQuality = currentQuality * 3;
        }
        else {
            newQuality = 0;
        }

        return newQuality;
    }
}
