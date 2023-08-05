package com.gildedrose;

public class BackStagePass extends Item{
    public BackStagePass(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.dayHasPassed();
        if(this.sellIn > 10){
           this.quality++;
        }
        else if(this.sellIn > 5){
            this.quality *= 2;
        }
        else if(this.sellIn >= 0){
            this.quality *= 3;
        }
        else {
            this.quality = 0;
        }
    }
}
