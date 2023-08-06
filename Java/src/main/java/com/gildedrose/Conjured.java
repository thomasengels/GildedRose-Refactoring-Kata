package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.dayHasPassed();
        if(this.isExpired()){
            this.quality = Math.max(0, this.quality - 4);

        }
        else {
            this.quality = Math.max(0, this.quality - 2);
        }
    }
}
