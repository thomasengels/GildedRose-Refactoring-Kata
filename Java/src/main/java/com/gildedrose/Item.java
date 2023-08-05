package com.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {

    String name;

    int sellIn;

    int quality;

    void updateQuality(){
        dayHasPassed();
        if(this.quality <= 0){
            return;
        }
        if(this.quality == 1){
            quality = 0;
            return;
        }
        if(this.isExpired()){
            this.quality -= 2;
        }
        else {
            this.quality--;
        }
    }

    protected void dayHasPassed() {
        this.sellIn--;
    }

    protected boolean isExpired(){
        return this.sellIn < 0;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", Quality " + this.quality;
    }
}
