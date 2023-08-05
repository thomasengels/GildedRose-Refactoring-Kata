package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.dayHasPassed();
        if(this.quality > 0){
            if(this.isExpired()){
                this.quality -= 4;
            }
            else {
                this.quality -= 2;
            }
        }
    }
}
