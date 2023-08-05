package com.gildedrose;

public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn--;
        if(this.quality > 0){
            if(this.sellIn < 0){
                this.quality -= 4;
            }
            else {
                this.quality -= 2;
            }
        }
    }
}
