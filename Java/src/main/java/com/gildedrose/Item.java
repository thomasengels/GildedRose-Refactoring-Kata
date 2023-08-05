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
        sellIn--;
        if(quality <= 0){
            return;
        }
        if(sellIn < 0){
            this.quality -= 2;
        }
        else {
            this.quality--;
        }
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
