package com.gildedrose;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Item {
    Updatable updater;

    int sellIn;
    String name;
    int quality;


    public void update(){
        this.sellIn -= 1;
        this.quality = this.updater.updateQuality(this.quality, this.sellIn);
    }
}
