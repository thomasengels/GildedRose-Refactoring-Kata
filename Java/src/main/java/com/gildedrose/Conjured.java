package com.gildedrose;

public class Conjured implements Updatable {
    @Override
    public int updateQuality(int currentQuality, int sellIn) {
        if(sellIn < 0){
            return Math.max(0, currentQuality - 4);

        }
        else {
            return Math.max(0, currentQuality - 2);
        }
    }
}
